package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ScissorsBeatPaper {

    @Test
    public void scissorsWinOverPaper() throws Exception {
        assertThat(new Game().play(new Scissors(), new Paper()), equalTo(Result.CHALLENGER_WINS));
    }
}
