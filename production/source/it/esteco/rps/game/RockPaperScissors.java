package it.esteco.rps.game;

import it.esteco.rps.rule.*;

import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
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
        return rules;
    }

}
