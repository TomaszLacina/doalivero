package pl.lacina.doalivero;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.lacina.doalivero.domain.Match;
import pl.lacina.doalivero.domain.MatchResult;
import pl.lacina.doalivero.domain.Player;
import pl.lacina.doalivero.domain.Team;
import pl.lacina.doalivero.respository.MatchRepository;
import pl.lacina.doalivero.respository.PlayerRepository;
import pl.lacina.doalivero.respository.TeamRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class DbPopulator {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    MatchRepository matchRepository;


    public DbPopulator(){
        populateDB();
    }

    private void populateDB(){
        generatePlayers();
        generateTeams();
        generateMatches();
    }

    private void generatePlayers() {
        for(int i = 0; i < 10; i++ ) {
            Player player = new Player();
            player.setName("Player " + i);
            playerRepository.save(player);
        }
    }

    private void generateTeams(){
        List<Player> allPlayers = playerRepository.findAll();

        while(!allPlayers.isEmpty()){
            Team team = new Team();
            Player player1 = allPlayers.remove(0);
            Player player2 = allPlayers.remove(0);
            team.setPlayers(Arrays.asList(player1,player2));

            teamRepository.save(team);
        }
    }

    private void generateMatches(){
        List<Team> teams = teamRepository.findAll();

        Random random = new Random();
        Match match = new Match();

        MatchResult matchResult = new MatchResult();
        matchResult.setTeam1Score(random.nextInt(5));
        matchResult.setTeam2Score(random.nextInt(5));
        match.setMatchResult(matchResult);

        match.setTeam1(teams.get(random.nextInt(teams.size())));
        match.setTeam2(teams.get(random.nextInt(teams.size())));

        matchRepository.save(match);
    }
}
