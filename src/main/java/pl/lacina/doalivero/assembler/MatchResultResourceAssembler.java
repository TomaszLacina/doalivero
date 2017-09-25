package pl.lacina.doalivero.assembler;

import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.MatchResult;
import pl.lacina.doalivero.resource.MatchResultResource;

@Component
public class MatchResultResourceAssembler {
    public MatchResultResource toResource(MatchResult matchResult) {
        return new MatchResultResource.Builder()
                .withTeam1Score(matchResult.getTeam1Score())
                .withTeam2Score(matchResult.getTeam2Score())
                .build();
    }

    public MatchResult fromResource(MatchResultResource matchResultResource) {
        MatchResult matchResult = new MatchResult();
        matchResult.setTeam1Score(matchResultResource.getTeam1Score());
        matchResult.setTeam2Score(matchResultResource.getTeam2Score());

        return matchResult;
    }
}
