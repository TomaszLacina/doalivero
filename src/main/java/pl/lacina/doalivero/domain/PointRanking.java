package pl.lacina.doalivero.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointRanking implements Ranking{

    @Override
    public RankingResult calculate(List<Match> matchList) {
        RankingResult rankingResult = new RankingResult();

        Map<String, PlayerResult>  resultMap = new HashMap<>();

        for(Match match : matchList){
            List<Player> players1 = match.getTeam1().getPlayers();
            List<Player> players2 = match.getTeam2().getPlayers();
            Integer score1 = match.getMatchResult().getTeam1Score();
            Integer score2 = match.getMatchResult().getTeam2Score();

            countScoreForTeam(resultMap, players1, score1);
            countScoreForTeam(resultMap, players2, score2);
        }

        rankingResult.setPlayerResultList(new ArrayList(resultMap.values()));

        return rankingResult;
    }

    private void countScoreForTeam(Map<String, PlayerResult> resultMap, List<Player> players, Integer score1) {
        for(Player player : players){
            if(!resultMap.containsKey(player.getId())){
                PlayerResult newResult = new PlayerResult();
                newResult.setScore(0D);
                newResult.setPlayer(player);
                resultMap.put(player.getId(), newResult);
            }
            PlayerResult playerResult = resultMap.get(player.getId());


            Double playerScore = playerResult.getScore();
            playerScore+= score1;
            playerResult.setScore(playerScore);
        }
    }
}
