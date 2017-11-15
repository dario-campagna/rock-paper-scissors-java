package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class SpockPaper implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.SPOCK.equals(challengeeMove) & Move.PAPER.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
