package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class ScissorsRock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.SCISSORS.equals(challengeeMove) && Move.ROCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
