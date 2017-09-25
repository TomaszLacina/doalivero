package pl.lacina.doalivero.resource;


public class MatchResultResource {

    private Integer team1Score;
    private Integer team2Score;

    public Integer getTeam1Score() {
        return team1Score;
    }

    public Integer getTeam2Score() {
        return team2Score;
    }

    public static class Builder {
        private MatchResultResource resource = new MatchResultResource();

        public Builder withTeam1Score(Integer team1Score){
            resource.team1Score = team1Score;
            return this;
        }

        public Builder withTeam2Score(Integer team2Score){
            resource.team2Score = team2Score;
            return this;
        }

        public MatchResultResource build(){
            return resource;
        }
    }
}
