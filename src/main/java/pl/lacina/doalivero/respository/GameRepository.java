package pl.lacina.doalivero.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.lacina.doalivero.domain.Game;
import pl.lacina.doalivero.domain.Match;

public interface GameRepository extends MongoRepository<Game, String>{
    Game findById(String id);
}
