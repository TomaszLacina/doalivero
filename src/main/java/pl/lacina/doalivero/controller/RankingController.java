package pl.lacina.doalivero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lacina.doalivero.assembler.RankingResultResourceAssembler;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.domain.PointRanking;
import pl.lacina.doalivero.domain.RankingResult;
import pl.lacina.doalivero.resource.RankingResultResource;
import pl.lacina.doalivero.respository.MatchRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/ranking")
public class RankingController {

    @Autowired
    RankingResultResourceAssembler rankingResultResourceAssembler;

    @Autowired
    MatchRepository matchRepository;

    @RequestMapping(path = "/point")
    public RankingResultResource getPointRanking(){
        List<Match> all = matchRepository.findAll();

        PointRanking pointRanking = new PointRanking();
        RankingResult calculate = pointRanking.calculate(all);

        return rankingResultResourceAssembler.toResource(calculate);
    }
}
