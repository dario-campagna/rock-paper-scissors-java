package it.esteco.rps.game;

import it.esteco.rps.rule.*;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissorsLizardSpock {
    public static Game game() {
        return new Game(rules());
    }

    private static List<Rule> rules() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new PaperScissors());
        rules.add(new PaperRock());
        rules.add(new PaperDraw());
        rules.add(new RockPaper());
        rules.add(new RockScissors());
        rules.add(new RockDraw());
        rules.add(new ScissorsPaper());
        rules.add(new ScissorsRock());
        rules.add(new ScissorsDraw());
        rules.add(new LizardDraw());
        rules.add(new LizardScissors());
        rules.add(new ScissorsLizard());
        rules.add(new LizardPaper());
        rules.add(new PaperLizard());
        rules.add(new LizardRock());
        rules.add(new RockLizard());
        rules.add(new SpockRock());
        rules.add(new RockSpock());
        rules.add(new SpockPaper());
        rules.add(new PaperSpock());
        rules.add(new SpockScissors());
        rules.add(new ScissorsSpock());
        rules.add(new SpockLizard());
        rules.add(new LizardSpock());
        rules.add(new SpockDraw());
        return rules;
    }

}
