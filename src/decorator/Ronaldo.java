package decorator;

public class Ronaldo extends player {

    public Ronaldo() {
        description = " Cristiano Ronaldo dos Santos Aveiro GOIH ComM is a Portuguese professional footballer who plays as a forward, Skills =>";
    }

    @Override
    public double cost() {
        return 31;
    }
}
