package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public interface Rule {
    Result apply(Move challengeeMove, Move challengerMove);
}
