package pl.lacina.doalivero.resource;


import java.util.List;

public class RankingResultResource {

    private List<PlayerResultResource> playerResultResources;


    public List<PlayerResultResource> getPlayerResultResources() {
        return playerResultResources;
    }

    public static class Builder{
        private RankingResultResource resource = new RankingResultResource();

        public Builder withPlayeResults(List<PlayerResultResource> playerResultResources){
            resource.playerResultResources = playerResultResources;
            return this;
        }

        public RankingResultResource build (){
            return resource;
        }
    }
}
