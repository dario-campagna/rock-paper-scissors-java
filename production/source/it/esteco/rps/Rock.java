package it.esteco.rps;

public class Rock implements Gesture {
    @Override
    public Result versus(Gesture gesture) {
        return Result.PLAYER_WINS;
    }
}
