package it.esteco.rps;

public class Scissors implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return gesture.challengedByScissors();
    }

    @Override
    public Result challengedByScissors() {
        return null;
    }

    @Override
    public Result challengedByPaper() {
        return Result.CHALLENGEE_WINS;
    }
}
