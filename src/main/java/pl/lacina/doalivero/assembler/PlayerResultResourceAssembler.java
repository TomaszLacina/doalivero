package pl.lacina.doalivero.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.PlayerResult;
import pl.lacina.doalivero.resource.PlayerResultResource;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerResultResourceAssembler {
    @Autowired
    PlayerResourceAssembler playerResourceAssembler;

    public List<PlayerResultResource> toResources(List<PlayerResult> playerResultList) {
        return playerResultList.stream()
                .map(playerResult -> this.toResource(playerResult))
                .collect(Collectors.toList());
    }

    public PlayerResultResource toResource(PlayerResult playerResult){
        return new PlayerResultResource.Builder()
                .withPlayerResource(playerResourceAssembler.toResource(playerResult.getPlayer()))
                .withScore(playerResult.getScore())
                .build();
    }
}
