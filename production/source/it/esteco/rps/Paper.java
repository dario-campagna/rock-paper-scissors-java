package it.esteco.rps;

public class Paper implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return null;
    }

    @Override
    public Result challengedByScissors() {
        return Result.CHALLENGER_WINS;
    }
}
