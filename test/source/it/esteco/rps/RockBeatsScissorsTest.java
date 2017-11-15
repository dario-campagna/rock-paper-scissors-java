package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.rules.PaperRockRule;
import it.esteco.rps.rules.RockScissorsRule;
import it.esteco.rps.rules.ScissorsRockRule;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockBeatsScissorsTest {

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new RockScissorsRule())).play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLosesOverRock() throws Exception {
        assertThat(new Game(() -> Arrays.asList(new ScissorsRockRule())).play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

}
