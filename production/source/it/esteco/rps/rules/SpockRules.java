package it.esteco.rps.rules;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import it.esteco.rps.rules.Rule;
import it.esteco.rps.rules.Rules;

import java.util.ArrayList;
import java.util.List;

public class SpockRules implements Rules {
    @Override
    public List<Rule> rules() {
        List<Rule> rules = new ArrayList<>();
        rules.add((challengeeMove, challengerMove) -> Move.SPOCK.equals(challengeeMove) & Move.ROCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.ROCK.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SPOCK.equals(challengeeMove) & Move.PAPER.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.PAPER.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SPOCK.equals(challengeeMove) & Move.SCISSORS.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SCISSORS.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SPOCK.equals(challengeeMove) & Move.LIZARD.equals(challengerMove) ? Result.CHALLENGER_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.LIZARD.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.CHALLENGEE_WINS : null);
        rules.add((challengeeMove, challengerMove) -> Move.SPOCK.equals(challengeeMove) & Move.SPOCK.equals(challengerMove) ? Result.DRAW : null);
        return rules;
    }
}
