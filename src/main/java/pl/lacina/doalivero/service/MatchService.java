package pl.lacina.doalivero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.respository.MatchRepository;
import pl.lacina.doalivero.respository.TeamRepository;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    TeamRepository teamRepository;

    public Match createOrUpdate(Match match){
//        if(match.getTeam1().getId() == null){
//            match.setTeam1(teamRepository.save(match.getTeam1()));
//        }
//        if(match.getTeam2().getId() == null){
//            match.setTeam2(teamRepository.save(match.getTeam2()));
//        }
        return matchRepository.save(match);
    }

    public Match getMatch(String id){
        return matchRepository.findById(id);
    }

    public List<Match> getAll() {
        return matchRepository.findAll();
    }
}
