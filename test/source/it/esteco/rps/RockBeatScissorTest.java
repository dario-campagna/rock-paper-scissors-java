package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RockBeatScissorTest {

    @Test
    public void rockWinsOverScissors() throws Exception {
        Game game = new Game();
        assertThat(game.play(new Rock(), new Scissors()), equalTo(Result.PLAYER_WINS));
    }
}
