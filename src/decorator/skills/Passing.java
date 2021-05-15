package decorator.skills;

import decorator.player;
import decorator.SkillsDecorator;

public class Passing extends SkillsDecorator {

    player player;

    public Passing(player player) {
        this.player = player;
    }

    @Override
    public double cost() {
        return player.cost() + 2;
    }

    @Override
    public void addSkill() {
        this.player.addSkill("Passing");
    }

    @Override
    public String getDescription() {
        return player.getDescription() + "\nPassing – Both Long and Short";
    }



}
