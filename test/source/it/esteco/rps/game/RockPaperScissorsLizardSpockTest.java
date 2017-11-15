package it.esteco.rps.game;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsLizardSpockTest {

    @Test
    public void playGame() throws Exception {
        Game game = RockPaperScissorsLizardSpock.game();
        assertThat(game.play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.PAPER, Move.PAPER), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.ROCK, Move.ROCK), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.SCISSORS, Move.SCISSORS), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.LIZARD, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.PAPER, Move.LIZARD), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.LIZARD, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.LIZARD), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.LIZARD, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.ROCK, Move.LIZARD), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.LIZARD, Move.LIZARD), is(equalTo(Result.DRAW)));
        assertThat(game.play(Move.SPOCK, Move.LIZARD), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.LIZARD, Move.SPOCK), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.SPOCK, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.ROCK, Move.SPOCK), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.SPOCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.SCISSORS, Move.SPOCK), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.SPOCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
        assertThat(game.play(Move.PAPER, Move.SPOCK), is(equalTo(Result.CHALLENGEE_WINS)));
        assertThat(game.play(Move.SPOCK, Move.SPOCK), is(equalTo(Result.DRAW)));
    }
}
