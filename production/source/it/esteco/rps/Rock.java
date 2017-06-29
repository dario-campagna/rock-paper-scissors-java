package it.esteco.rps;

public class Rock implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return gesture.challengedByRock();
    }

    @Override
    public Result challengedByScissors() {
        return Result.CHALLENGEE_WINS;
    }

    @Override
    public Result challengedByPaper() {
        return Result.CHALLENGER_WINS;
    }

    @Override
    public Result challengedByRock() {
        return null;
    }
}
