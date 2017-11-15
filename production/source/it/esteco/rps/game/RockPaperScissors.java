package it.esteco.rps.game;

import it.esteco.rps.rules.*;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
    public static Game game() {
        Rules rules = new RockPaperScissorsRules();
        return new Game(rules);
    }

    private static class RockPaperScissorsRules implements Rules {

        private final List<Rule> rules;

        public RockPaperScissorsRules() {
            rules = new ArrayList<>();
            rules.add(new PaperScissorsRule());
            rules.add(new PaperRockRule());
            rules.add(new PaperDrawRule());
            rules.add(new RockPaperRule());
            rules.add(new RockScissorsRule());
            rules.add(new RockDrawRule());
            rules.add(new ScissorsPaperRule());
            rules.add(new ScissorsRockRule());
            rules.add(new ScissorsDrawRule());
        }

        @Override
        public List<Rule> rules() {
            return rules;
        }
    }
}
