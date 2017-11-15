package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.rule.RockScissors;
import it.esteco.rps.rule.ScissorsRock;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockBeatsScissorsTest {

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(new Game(Arrays.asList(new RockScissors())).play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLosesOverRock() throws Exception {
        assertThat(new Game(Arrays.asList(new ScissorsRock())).play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

}
