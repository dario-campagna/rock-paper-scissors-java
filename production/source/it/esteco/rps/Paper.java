package it.esteco.rps;

import java.util.ArrayList;
import java.util.List;

public class Paper {
    public static List<Rule> rules() {
        List<Rule> rules = new ArrayList<>();
        rules.add((challengeeMove, challengerMove) -> Move.PAPER.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.ROCK.equals(challengeeMove) & Move.PAPER.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        return rules;
    }
}
