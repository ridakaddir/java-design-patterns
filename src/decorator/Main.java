package decorator;

import decorator.skills.Dribbling;
import decorator.skills.Passing;
import decorator.skills.Shooting;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ronaldo example");
        player ronaldo = new Shooting(new Shooting(new Ronaldo()));
        System.out.println(ronaldo.getDescription() + "\n" + "Cost Million $ =>" + ronaldo.cost() );

        System.out.println("Messi example");
        player messi = new Dribbling(new Dribbling(new Passing(new Shooting(new Messi()))));
        System.out.println(messi.getDescription() + "\n" + "Cost Million $ =>" + messi.cost() );


    }
}
