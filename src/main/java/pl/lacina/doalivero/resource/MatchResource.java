package pl.lacina.doalivero.resource;

public class MatchResource {

    private String id;
    private TeamResource team1;
    private TeamResource team2;
    private MatchResultResource matchResult;

    public String getId() {
        return id;
    }

    public TeamResource getTeam1() {
        return team1;
    }

    public TeamResource getTeam2() {
        return team2;
    }

    public MatchResultResource getMatchResult() {
        return matchResult;
    }

    public static class Builder{
        private MatchResource resource = new MatchResource();

        public Builder withId(String id){
            resource.id = id;
            return this;
        }

        public Builder withTeam1(TeamResource team1){
            resource.team1 = team1;
            return this;
        }

        public Builder withTeam2(TeamResource team2){
            resource.team2 = team2;
            return this;
        }

        public Builder withMatchResult(MatchResultResource matchResult){
            resource.matchResult = matchResult;
            return this;
        }

        public MatchResource build(){
            return resource;
        }
    }

}
