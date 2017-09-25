package pl.lacina.doalivero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lacina.doalivero.assembler.MatchResourceAssembler;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.resource.MatchResource;
import pl.lacina.doalivero.service.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    MatchService matchService;

    @Autowired
    MatchResourceAssembler matchResourceAssembler;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public MatchResource getById(@PathVariable("id") String  id){
        Match matchById = matchService.getMatch(id);

        return matchResourceAssembler.toResource(matchById);
    }

    @RequestMapping(method = RequestMethod.POST)
    public MatchResource create(@RequestBody MatchResource matchResource){
        Match match = matchResourceAssembler.fromResource(matchResource);
        return matchResourceAssembler.toResource(matchService.createOrUpdate(match));

    }
}
