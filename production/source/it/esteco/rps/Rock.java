package it.esteco.rps;

public class Rock implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengedByRock();
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
        return Result.DRAW;
    }
}