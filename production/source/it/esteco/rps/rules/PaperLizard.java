package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class PaperLizard implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.PAPER.equals(challengeeMove) && Move.LIZARD.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
