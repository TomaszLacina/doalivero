package pl.lacina.doalivero.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.RankingResult;
import pl.lacina.doalivero.resource.RankingResultResource;

@Component
public class RankingResultResourceAssembler {

    @Autowired
    PlayerResultResourceAssembler playerResultResourceAssembler;

    public RankingResultResource toResource(RankingResult rankingResult) {
        return new RankingResultResource.Builder()
                .withPlayeResults(playerResultResourceAssembler.toResources(rankingResult.getPlayerResultList()))
                .build();
    }
}
