package pl.lacina.doalivero.resource;

import java.util.List;

public class TeamResource {
    private String id;
    private List<PlayerResource> players;

    public String getId() {
        return id;
    }

    public List<PlayerResource> getPlayers() {
        return players;
    }

    public static class Builder{
        private TeamResource resource = new TeamResource();

        public Builder withId(String id){
            resource.id = id;
            return this;
        }
        public Builder withPlayers(List<PlayerResource> players){
            resource.players = players;
            return this;
        }

        public TeamResource build (){
            return resource;
        }
    }
}
