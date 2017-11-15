package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class LizardScissors implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.LIZARD.equals(challengeeMove) && Move.SCISSORS.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
