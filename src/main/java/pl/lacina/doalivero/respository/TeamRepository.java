package pl.lacina.doalivero.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.domain.Team;

public interface TeamRepository extends MongoRepository<Team, String>{
   Team findById(String id);
}
