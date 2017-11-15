package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {

    @Test
    public void playGame() throws Exception {
        Game game = RockPaperScissors.game();
        assertThat(game.play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }
}
