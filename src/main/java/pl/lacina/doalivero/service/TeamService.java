package pl.lacina.doalivero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacina.doalivero.domain.Game;
import pl.lacina.doalivero.domain.Team;
import pl.lacina.doalivero.respository.TeamRepository;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public Team createOrUpdate(Team team){
        return teamRepository.save(team);
    }

    public Team getGame(String id){
        return teamRepository.findById(id);
    }

    public List<Team> getAll(){
        return teamRepository.findAll();
    }
}
