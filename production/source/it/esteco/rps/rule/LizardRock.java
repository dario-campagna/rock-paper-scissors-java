package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class LizardRock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.LIZARD.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
