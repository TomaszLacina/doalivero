package pl.lacina.doalivero.assembler;

import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.Game;
import pl.lacina.doalivero.resource.GameResource;

@Component
public class GameResourceAssembler {

    public GameResource toResource(Game game){
        return new GameResource.Builder()
                .withId(game.id)
                .withName(game.getName())
                .withGameType(game.getGameType())
                .withTeamSize(game.getTeamSize())
                .build();
    }

    public Game fromResource(GameResource gameResource){
        Game game  = new Game();
        game.setId(gameResource.getId());
        game.setName(gameResource.getName());
        game.setGameType(gameResource.getGameType());
        game.setTeamSize(game.getTeamSize());

        return game;
    }
}
