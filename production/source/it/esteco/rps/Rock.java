package it.esteco.rps;

public class Rock implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengesRock();
    }

    @Override
    public Result challengesScissors() {
        return Result.CHALLENGER_WINS;
    }

    @Override
    public Result challengesPaper() {
        return Result.CHALLENGEE_WINS;
    }

    @Override
    public Result challengesRock() {
        return Result.DRAW;
    }
}