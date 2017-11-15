package it.esteco.rps;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApplyRulesTest {

    @Test
    public void applyRules() throws Exception {
        Rule rule = mock(Rule.class);
        when(rule.apply(any(),any())).thenReturn(Result.CHALLENGEE_WINS);
        Rule inapplicableRule = mock(Rule.class);
        when(inapplicableRule.apply(any(), any())).thenReturn(null);
        Rules rules = mock(Rules.class);
        when(rules.rules()).thenReturn(Arrays.asList(inapplicableRule, rule));

        Game game = new Game(rules);

        assertThat(game.play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

}
