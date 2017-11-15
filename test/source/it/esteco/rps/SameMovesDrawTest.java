package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SameMovesDrawTest {

    @Test
    public void rockAgainstRock() throws Exception {
        assertThat(new Game().play(new Rock(), new Rock()), equalTo(Result.DRAW));
    }

    @Test
    public void paperAgainstPaper() throws Exception {
        assertThat(new Game().play(new Paper(), new Paper()), equalTo(Result.DRAW));
    }

    @Test
    public void scissorsAgainstScissors() throws Exception {
        assertThat(new Game().play(new Scissors(), new Scissors()), equalTo(Result.DRAW));
    }
}
