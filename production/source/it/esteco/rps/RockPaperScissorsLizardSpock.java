package it.esteco.rps;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissorsLizardSpock {
    public static Game game() {
        return new Game(new RockPaperScissorsLizardSpockRules());
    }

    private static class RockPaperScissorsLizardSpockRules implements Rules {
        @Override
        public List<Rule> rules() {
            List<Rule> rules = new ArrayList<>();
            rules.addAll(new PaperRules().rules());
            rules.addAll(new RockRules().rules());
            rules.addAll(new ScissorsRules().rules());
            rules.addAll(new LizardRules().rules());
            rules.addAll(new SpockRules().rules());
            return rules;
        }
    }
}
