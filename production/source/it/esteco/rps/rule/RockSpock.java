package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class RockSpock implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.ROCK.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null;
    }
}
