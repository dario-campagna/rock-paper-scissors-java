package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockBeatsScissorsTest {

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(new Game(Rocks.rules()).play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLoseOverRock() throws Exception {
        assertThat(new Game(Rocks.rules()).play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }
}
