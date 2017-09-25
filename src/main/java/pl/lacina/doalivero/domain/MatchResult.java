package pl.lacina.doalivero.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MatchResult {
    private Integer team1Score;
    private Integer team2Score;


    public Integer getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(Integer team1Score) {
        this.team1Score = team1Score;
    }

    public Integer getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(Integer team2Score) {
        this.team2Score = team2Score;
    }
}
