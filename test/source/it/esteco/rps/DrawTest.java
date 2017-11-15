package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.rules.PaperDraw;
import it.esteco.rps.rules.RockDraw;
import it.esteco.rps.rules.ScissorsDraw;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DrawTest {

    @Test
    public void paperDraw() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new PaperDraw())).play(Move.PAPER, Move.PAPER), is(equalTo(Result.DRAW)));
    }

    @Test
    public void scissorsDraw() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new ScissorsDraw())).play(Move.SCISSORS, Move.SCISSORS), is(equalTo(Result.DRAW)));
    }

    @Test
    public void rockDraw() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new RockDraw())).play(Move.ROCK, Move.ROCK), is(equalTo(Result.DRAW)));
    }

}
