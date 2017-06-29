package it.esteco.rps;

public class Paper implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengedByPaper();
    }

    @Override
    public Result challengedByScissors() {
        return Result.CHALLENGER_WINS;
    }

    @Override
    public Result challengedByPaper() {
        return Result.DRAW;
    }

    @Override
    public Result challengedByRock() {
        return Result.CHALLENGEE_WINS;
    }
}