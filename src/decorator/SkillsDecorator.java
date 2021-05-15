package decorator;

public abstract class SkillsDecorator extends player {
    player player;
    public abstract void addSkill();
    public abstract String getDescription();
}
