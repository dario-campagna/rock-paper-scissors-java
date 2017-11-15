package it.esteco.rps.game;

import it.esteco.rps.rules.*;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissorsLizardSpock {
    public static Game game() {
        return new Game(new RockPaperScissorsLizardSpockRules());
    }

    private static class RockPaperScissorsLizardSpockRules implements Rules {

        private final List<Rule> rules;

        public RockPaperScissorsLizardSpockRules() {
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
            rules.addAll(new LizardRules().rules());
            rules.addAll(new SpockRules().rules());
        }

        @Override
        public List<Rule> rules() {
            return rules;
        }
    }
}
