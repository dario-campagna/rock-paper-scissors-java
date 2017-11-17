package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ScissorsBeatPaperTest {

    @Test
    public void scissorsWinAgainstPaper() throws Exception {
        assertThat(new Game().play(new Scissors(), new Paper()), equalTo(Result.CHALLENGEE_WINS));
    }

    @Test
    public void paperLosesAgainstScissiors() throws Exception {
        assertThat(new Game().play(new Paper(), new Scissors()), equalTo(Result.CHALLENGER_WINS));
    }
}
