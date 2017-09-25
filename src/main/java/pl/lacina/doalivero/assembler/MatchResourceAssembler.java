package pl.lacina.doalivero.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.resource.MatchResource;

@Component
public class MatchResourceAssembler {

    @Autowired
    TeamResourceAssembler teamResourceAssembler;

    @Autowired
    MatchResultResourceAssembler matchResultResourceAssembler;

    public MatchResource toResource(Match match){
        return new MatchResource.Builder()
                .withId(match.getId())
                .withTeam1(teamResourceAssembler.toResource(match.getTeam1()))
                .withTeam2(teamResourceAssembler.toResource(match.getTeam2()))
                .withMatchResult(matchResultResourceAssembler.toResource(match.getMatchResult()))
                .build();
    }

    public Match fromResource(MatchResource matchResource){
        Match match = new Match();
        match.setId(matchResource.getId());
        match.setMatchResult(matchResultResourceAssembler.fromResource(matchResource.getMatchResult()));
        match.setTeam1(teamResourceAssembler.fromResource(matchResource.getTeam1()));
        match.setTeam2(teamResourceAssembler.fromResource(matchResource.getTeam2()));

        return match;
    }
}
