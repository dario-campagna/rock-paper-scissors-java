package it.esteco.rps.rule;

import it.esteco.rps.Move;
import it.esteco.rps.Result;

public interface Rule {
    Result apply(Move challengeeMove, Move challengerMove);
}
