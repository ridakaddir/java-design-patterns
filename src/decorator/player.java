package decorator;

import java.util.List;

public abstract class player {

    String description = "Unknown Beverage";

    List<String> skills;

    public String getDescription() {
        return description;
    }

    public void addSkill(String skill){
        this.skills.add(skill);
    }

    public abstract double cost();
}
