package it.esteco.rps;

import java.util.ArrayList;
import java.util.List;

public class ScissorsRules implements Rules {

    @Override
    public List<Rule> rules() {
        List<Rule> rules = new ArrayList<>();
        rules.add((challengeeMove, challengerMove) -> Move.SCISSORS.equals(challengeeMove) && Move.PAPER.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SCISSORS.equals(challengeeMove) && Move.ROCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SCISSORS.equals(challengeeMove) & Move.SCISSORS.equals(challengerMove) ? Result.DRAW : null);
        return rules;
    }
}
