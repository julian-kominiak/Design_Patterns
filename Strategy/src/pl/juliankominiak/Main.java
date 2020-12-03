package pl.juliankominiak;

import pl.juliankominiak.display.DisplayAsGraphics;
import pl.juliankominiak.display.DisplayAsText;
import pl.juliankominiak.fly.NoFly;
import pl.juliankominiak.fly.QuickFly;
import pl.juliankominiak.quack.NoQuack;
import pl.juliankominiak.quack.SimpleQuack;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck(new NoFly(), new SimpleQuack(), new DisplayAsText());
        Duck duck2 = new Duck(new QuickFly(), new NoQuack(), new DisplayAsText());
        Duck duck3 = new Duck(new NoFly(), new NoQuack(), new DisplayAsGraphics());

        duck1.fly();
        duck2.quack();
        duck3.display();

    }
}
