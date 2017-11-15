package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.rule.PaperRock;
import it.esteco.rps.rule.RockPaper;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaperBeatsRockTest {

    @Test
    public void paperBeatsRock() throws Exception {
        assertThat(new Game(Arrays.asList(new PaperRock())).play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void rockLosesOverPaper() throws Exception {
        assertThat(new Game(Arrays.asList(new RockPaper())).play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }

}
