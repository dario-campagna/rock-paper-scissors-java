package it.esteco.rps;

public interface Move {
    Result versus(Move move);

    Result challengedByScissors();

    Result challengedByPaper();

    Result challengedByRock();
}
