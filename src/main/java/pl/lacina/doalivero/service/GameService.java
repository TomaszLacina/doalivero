package pl.lacina.doalivero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacina.doalivero.domain.Game;
import pl.lacina.doalivero.respository.GameRepository;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public Game createOrUpdate(Game game){
        return gameRepository.save(game);
    }

    public Game getGameById(String id){
        return gameRepository.findById(id);
    }

    public List<Game> getAll(){
        return gameRepository.findAll();
    }


}
