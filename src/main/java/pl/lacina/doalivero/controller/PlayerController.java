package pl.lacina.doalivero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lacina.doalivero.assembler.PlayerResourceAssembler;
import pl.lacina.doalivero.domain.Player;
import pl.lacina.doalivero.resource.PlayerResource;
import pl.lacina.doalivero.service.PlayerService;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerResourceAssembler playerResourceAssembler;
    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<PlayerResource> getAllPlayers(){
        List<Player> all = playerService.getAll();

        return playerResourceAssembler.toResources(all);
    }

    @RequestMapping(value = "/player", method = RequestMethod.PUT)
    public PlayerResource createOrUpdatePlayer(@RequestBody PlayerResource playerResource){
        Player player = playerResourceAssembler.fromResource(playerResource);
        Player savedPlayer = playerService.createOrUpdate(player);

        return playerResourceAssembler.toResource(savedPlayer);
    }
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public PlayerResource getPlayer(@RequestParam String id){
        Player player = playerService.getPlayer(id);
        PlayerResource playerResource = playerResourceAssembler.toResource(player);

        return playerResource;
    }

}
