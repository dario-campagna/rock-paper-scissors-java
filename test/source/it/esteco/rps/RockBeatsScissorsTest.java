package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RockBeatsScissorsTest {

    @Test
    public void rockWinsOverScissors() throws Exception {
        assertThat(new Game().play(new Rock(), new Scissors()), equalTo(Result.PLAYER_WINS));
    }

    @Test
    public void scissorsLoseOverRock() throws Exception {
        assertThat(new Game().play(new Scissors(), new Rock()), equalTo(Result.OPPONENT_WINS));
    }
}
