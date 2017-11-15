package it.esteco.rps.game;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import it.esteco.rps.rule.Rule;

import java.util.List;

public class Game {

    private List<Rule> rules;

    public Game(List<Rule> rules) {
        this.rules = rules;
    }

    public Result play(Move challengeeMove, Move challengerMove) {
        Rule rule = rules.stream().filter(r -> r.apply(challengeeMove, challengerMove) != null).findFirst().get();
        return rule.apply(challengeeMove, challengerMove);
    }
}