package it.esteco.rps;

public class Scissors implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return Result.OPPONENT_WINS;
    }
}
