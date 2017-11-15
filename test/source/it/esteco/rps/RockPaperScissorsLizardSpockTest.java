package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsLizardSpockTest {

    @Test
    public void playGame() throws Exception {
        Game game = RockPaperScissorsLizardSpock.game();
        assertThat(game.play(Move.LIZARD, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.ROCK, Move.SPOCK), is(equalTo(Result.CHALLENGER_WINS)));
    }
}
