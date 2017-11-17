package it.esteco.rps;

public interface Move {
    Result versus(Move move);

    Result challengesScissors();

    Result challengesPaper();

    Result challengesRock();
}
