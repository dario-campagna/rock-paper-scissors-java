package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public class RockDraw implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.ROCK.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.DRAW : null;
    }
}
