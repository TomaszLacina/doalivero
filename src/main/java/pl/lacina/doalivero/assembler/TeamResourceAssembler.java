package pl.lacina.doalivero.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.Team;
import pl.lacina.doalivero.resource.TeamResource;

@Component
public class TeamResourceAssembler {

    @Autowired
    PlayerResourceAssembler playerResourceAssembler;


    public TeamResource toResource(Team team) {
        return new TeamResource.Builder()
                .withId(team.getId())
                .withPlayers(playerResourceAssembler.toResources(team.getPlayers()))
                .build();
    }

    public Team fromResource(TeamResource teamResource) {
        Team team = new Team();
        team.setId(teamResource.getId());
        team.setPlayers(playerResourceAssembler.fromResources(teamResource.getPlayers()));

        return team;
    }
}
