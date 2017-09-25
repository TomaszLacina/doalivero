package pl.lacina.doalivero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacina.doalivero.domain.Player;
import pl.lacina.doalivero.respository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public Player createOrUpdate(Player player){
        return playerRepository.save(player);
    }

    public List<Player> getAll(){
        return  playerRepository.findAll();
    }

    public Player getPlayer(String id){
        return playerRepository.findById(id);
    }


}
