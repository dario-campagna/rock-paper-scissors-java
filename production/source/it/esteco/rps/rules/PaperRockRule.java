package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import it.esteco.rps.rules.Rule;

public class PaperRockRule implements Rule {
    @Override
    public Result apply(Move challengeeMove, Move challengerMove) {
        return Move.PAPER.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null;
    }
}
