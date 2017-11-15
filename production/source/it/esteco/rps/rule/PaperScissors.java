package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class PaperScissors implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.PAPER.equals(challengeeMove) && Move.SCISSORS.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
