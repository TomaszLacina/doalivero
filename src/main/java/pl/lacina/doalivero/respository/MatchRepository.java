package pl.lacina.doalivero.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.lacina.doalivero.domain.Match;

public interface MatchRepository extends MongoRepository<Match, String>{
    Match findById(String id);
}
