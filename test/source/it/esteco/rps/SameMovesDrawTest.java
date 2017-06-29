package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class SameMovesDrawTest {

    @Test
    public void rockOverRock() throws Exception {
        assertThat(new Game().play(new Rock(), new Rock()), equalTo(Result.DRAW));
    }

    @Test
    public void paperOverPaper() throws Exception {
        assertThat(new Game().play(new Paper(), new Paper()), equalTo(Result.DRAW));
    }
}
