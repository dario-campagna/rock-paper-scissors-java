package it.esteco.rps;

public class Scissors implements Move {
    @Override
    public Result versus(Move move) {
        return move.challengesScissors();
    }

    @Override
    public Result challengesScissors() {
        return Result.DRAW;
    }

    @Override
    public Result challengesPaper() {
        return Result.CHALLENGER_WINS;
    }

    @Override
    public Result challengesRock() {
        return Result.CHALLENGEE_WINS;
    }
}
