package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PaperBeatsRockTest {

    @Test
    public void paperWinsAgainstRock() throws Exception {
        assertThat(new Game().play(new Paper(), new Rock()), equalTo(Result.CHALLENGEE_WINS));
    }

    @Test
    public void rockLosesAgainstPaper() throws Exception {
        assertThat(new Game().play(new Rock(), new Paper()), equalTo(Result.CHALLENGER_WINS));
    }
}
