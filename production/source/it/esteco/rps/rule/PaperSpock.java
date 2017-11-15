package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class PaperSpock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.PAPER.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
