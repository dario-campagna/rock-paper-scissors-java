package it.esteco.rps;

public interface Rule {
    Result apply(Move challengeeMove, Move challengerMove);
}
