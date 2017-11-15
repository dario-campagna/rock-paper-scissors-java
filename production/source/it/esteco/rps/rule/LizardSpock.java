package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class LizardSpock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.LIZARD.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
