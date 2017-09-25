package pl.lacina.doalivero.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Game {

    @Id
    public String id;

    String name;
    Integer teamSize;
    String gameType;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public String getGameType() {
        return gameType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
