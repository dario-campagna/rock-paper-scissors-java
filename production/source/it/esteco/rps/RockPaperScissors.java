package it.esteco.rps;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
    public static Game game() {
        Rules rules = new RockPaperScissorsRules();
        return new Game(rules);
    }

    private static class RockPaperScissorsRules implements Rules {
        @Override
        public List<Rule> rules() {
            List<Rule> rules = new ArrayList<>();
            rules.addAll(new PaperRules().rules());
            rules.addAll(new RockRules().rules());
            rules.addAll(new ScissorsRules().rules());
            return rules;
        }
    }
}
