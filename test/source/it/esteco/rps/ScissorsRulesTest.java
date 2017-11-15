package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsRulesTest {

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(new Game(new ScissorsRules()).play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLoseOverRock() throws Exception {
        assertThat(new Game(new ScissorsRules()).play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }
}
