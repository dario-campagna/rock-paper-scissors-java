package it.esteco.rps;

public interface Gesture {
    Result versus(Gesture gesture);

    Result challengedByScissors();

    Result challengedByPaper();

    Result challengedByRock();
}
