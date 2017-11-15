package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class RockLizard implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.ROCK.equals(challengeeMove) && Move.LIZARD.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
