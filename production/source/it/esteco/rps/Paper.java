package it.esteco.rps;

public class Paper implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return gesture.challengedByPaper();
    }

    @Override
    public Result challengedByScissors() {
        return Result.CHALLENGER_WINS;
    }

    @Override
    public Result challengedByPaper() {
        return null;
    }

    @Override
    public Result challengedByRock() {
        return Result.CHALLENGEE_WINS;
    }
}
