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
            rules.add(new PaperScissors());
            rules.add(new PaperRock());
            rules.add(new PaperDraw());
            rules.add(new RockPaper());
            rules.add(new RockScissors());
            rules.add(new RockDraw());
            rules.add(new ScissorsPaper());
            rules.add(new ScissorsRock());
            rules.add(new ScissorsDraw());
        }

        @Override
        public List<Rule> rules() {
            return rules;
        }
    }
}
