package decorator.skills;

import decorator.SkillsDecorator;
import decorator.player;

public class Dribbling extends SkillsDecorator {

    player player;

    public Dribbling(player player) {
        this.player = player;
    }

    @Override
    public double cost() {
        return player.cost() + 10;
    }

    @Override
    public void addSkill() {
        this.player.addSkill("Dribbling");
    }

    @Override
    public String getDescription() {
        return player.getDescription() + "\nThis skill will help you get around opponents" ;
    }



}
