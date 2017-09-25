package pl.lacina.doalivero.resource;

import org.springframework.boot.web.client.RestTemplateBuilder;

public class GameResource {

    private String id;
    private String name;
    private String gameType;
    private Integer teamSize;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGameType() {
        return gameType;
    }

    public static class Builder{
        private GameResource resource = new GameResource();

        public Builder withId(String id){
            resource.id = id;
            return this;
        }

        public Builder withName(String name){
            resource.name = name;
            return this;
        }

        public Builder withGameType(String gameType){
            resource.gameType = gameType;
            return this;
        }


        public GameResource build(){
            return resource;
        }

        public Builder withTeamSize(Integer teamSize) {
            resource.teamSize = teamSize;
            return this;
        }
    }

}
