package it.esteco.rps;

public class Game {
    public Result play(Move playerMove, Move opponentMove) {
        return playerMove.versus(opponentMove);
    }
}
