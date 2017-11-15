package it.esteco.rps;

public class Game {

    private Rules rules;

    public Game(Rules rules) {
        this.rules = rules;
    }

    public Result play(Move challengeeMove, Move challengerMove) {
        Rule rule = rules.rules().stream().filter(r -> r.apply(challengeeMove, challengerMove) != null).findFirst().get();
        return rule.apply(challengeeMove, challengerMove);
    }
}