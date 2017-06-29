package it.esteco.rps;

public class Game {
    public Result play(Gesture playerGesture, Gesture opponentGesture) {
        return playerGesture.versus(opponentGesture);
    }
}
