package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class ScissorsLizard implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.SCISSORS.equals(challengeeMove) && Move.LIZARD.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
