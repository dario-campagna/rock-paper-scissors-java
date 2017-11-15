package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class SpockRock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.SPOCK.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
