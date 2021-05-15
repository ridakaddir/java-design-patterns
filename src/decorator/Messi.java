package decorator;

public class Messi extends player {

    public Messi() {
        description = " Lionel Andrés Messi is an Argentine professional footballer who plays as a forward and captains both Spanish club Barcelona and the Argentina national team, Skills => ";
    }

    @Override
    public double cost() {
        return 71;
    }
}
