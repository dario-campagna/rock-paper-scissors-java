package it.esteco.rps;

public class Game {
    public Result play(Moves challengeeMove, Moves challengerMove) {
        return Moves.ROCK.equals(challengeeMove) ? Result.CHALLENGEE_WINS : Result.CHALLENGER_WINS;
    }
}
