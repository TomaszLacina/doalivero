package pl.lacina.doalivero.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.lacina.doalivero.domain.Player;

public interface PlayerRepository extends MongoRepository<Player, String>{

    Player findById(String id);
}
