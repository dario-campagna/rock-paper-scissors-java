package it.esteco.rps;

public class Paper implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengesPaper();
    }

    @Override
    public Result challengesScissors() {
        return Result.CHALLENGEE_WINS;
    }

    @Override
    public Result challengesPaper() {
        return Result.DRAW;
    }

    @Override
    public Result challengesRock() {
        return Result.CHALLENGER_WINS;
    }
}