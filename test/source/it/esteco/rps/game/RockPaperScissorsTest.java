package it.esteco.rps.game;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {

    @Test
    public void playGame() throws Exception {
        Game game = RockPaperScissors.game();
        assertThat(game.play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.PAPER, Move.PAPER), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.ROCK, Move.ROCK), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.SCISSORS, Move.SCISSORS), is(equalTo(Result.DRAW)));
    }
}
