package pl.lacina.doalivero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lacina.doalivero.assembler.GameResourceAssembler;
import pl.lacina.doalivero.domain.Game;
import pl.lacina.doalivero.resource.GameResource;
import pl.lacina.doalivero.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @Autowired
    GameResourceAssembler gameResourceAssembler;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public GameResource getById(@PathVariable("id") String  id){
        Game gameById = gameService.getGameById(id);

        return gameResourceAssembler.toResource(gameById);
    }

    @RequestMapping(method = RequestMethod.POST)
    public GameResource create(@RequestBody GameResource gameResource){
        Game game = gameResourceAssembler.fromResource(gameResource);

        return gameResourceAssembler.toResource(gameService.createOrUpdate(game));

    }

}
