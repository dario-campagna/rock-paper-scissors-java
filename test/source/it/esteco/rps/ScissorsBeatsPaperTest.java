package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.rules.PaperScissors;
import it.esteco.rps.rules.ScissorsPaper;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsBeatsPaperTest {

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new ScissorsPaper())).play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void paperLoseOverScissors() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new PaperScissors())).play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
    }

}
