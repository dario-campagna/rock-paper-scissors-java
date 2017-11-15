package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class PaperDraw implements Rule {

    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.PAPER.equals(challengeeMove) & Move.PAPER.equals(challengerMove) ? Result.DRAW : null;
    }
}
