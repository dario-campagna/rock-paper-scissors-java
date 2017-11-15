package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RockBeatsScissorsTest {

    @Test
    public void rockWinsAgainstScissors() throws Exception {
        assertThat(new Game().play(new Rock(), new Scissors()), equalTo(Result.CHALLENGER_WINS));
    }

    @Test
    public void scissorsLoseAgainstRock() throws Exception {
        assertThat(new Game().play(new Scissors(), new Rock()), equalTo(Result.CHALLENGEE_WINS));
    }
}
