package pl.lacina.doalivero.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.Player;
import pl.lacina.doalivero.resource.PlayerResource;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerResourceAssembler {


    public PlayerResource toResource(Player player){
        return new PlayerResource.PlayerBuilder()
                .withId(player.getId())
                .withName(player.getName())
                .withActive(player.getActive())
                .build();
    }

    public List<PlayerResource> toResources(List<Player> playerList){
        return playerList.stream()
                .map(player -> this.toResource(player))
                .collect(Collectors.toList());
    }

    public List<Player> fromResources(List<PlayerResource> playerResources){
        return playerResources.stream()
                .map(playerResource -> this.fromResource(playerResource))
                .collect(Collectors.toList());
    }

    public Player fromResource(PlayerResource resource){
        Player player = new Player();
        player.setId(resource.getId());
        player.setName(resource.getName());
        player.setActive(resource.getActive());

        return player;
    }

}
