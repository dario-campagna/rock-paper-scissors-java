package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PaperBeatsRockTest {

    @Test
    public void paperWinsOverRock() throws Exception {
        assertThat(new Game().play(new Paper(), new Rock()), equalTo(Result.CHALLENGER_WINS));
    }
}
