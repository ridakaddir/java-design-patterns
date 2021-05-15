package decorator.skills;

import decorator.SkillsDecorator;
import decorator.player;

public class Shooting extends SkillsDecorator {

    player player;

    public Shooting(player player) {
        this.player = player;
    }

    @Override
    public double cost() {
        return player.cost() + 5;
    }

    @Override
    public void addSkill() {
        this.player.addSkill("Shooting");
    }

    @Override
    public String getDescription() {
        return player.getDescription() + "\nIf you don't shoot, you’ll never score";
    }



}
