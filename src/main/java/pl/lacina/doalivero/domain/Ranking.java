package pl.lacina.doalivero.domain;

import java.util.List;

public interface Ranking {
    RankingResult calculate(List<Match> matchList);
}
