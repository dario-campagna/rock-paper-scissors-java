package it.esteco.rps;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Rule> rules;

    public Game() {
        rules = new ArrayList<>();
    }

    public Game(List<Rule> rules) {
        this.rules = rules;
    }

    public Result play(Move challengeeMove, Move challengerMove) {
        if (rules.isEmpty()) {
            return Move.ROCK.equals(challengeeMove) ? Result.CHALLENGEE_WINS : Result.CHALLENGER_WINS;
        } else {
            Rule rule = rules.stream().filter(r -> r.apply(challengeeMove, challengerMove) != null).findFirst().get();
            return rule.apply(challengeeMove, challengerMove);
        }
    }
}