package it.esteco.rps;

public class Scissors implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengedByScissors();
    }

    @Override
    public Result challengedByScissors() {
        return Result.DRAW;
    }

    @Override
    public Result challengedByPaper() {
        return Result.CHALLENGEE_WINS;
    }

    @Override
    public Result challengedByRock() {
        return Result.CHALLENGER_WINS;
    }
}
