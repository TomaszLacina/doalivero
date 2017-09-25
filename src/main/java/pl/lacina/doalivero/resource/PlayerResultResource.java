package pl.lacina.doalivero.resource;

public class PlayerResultResource {

    private PlayerResource playerResource;
    private Double score;

    public PlayerResource getPlayerResource() {
        return playerResource;
    }

    public Double getScore() {
        return score;
    }

    public static class Builder {
        PlayerResultResource resource = new PlayerResultResource();

        public Builder withPlayerResource(PlayerResource playerResource){
            resource.playerResource = playerResource;
            return this;
        }

        public PlayerResultResource build() {
            return resource;
        }

        public Builder withScore(Double score) {
            resource.score = score;
            return this;
        }
    }
}