package pl.juliankominiak;

import pl.juliankominiak.display.IDisplayBehaviour;
import pl.juliankominiak.fly.IFlyBehaviour;
import pl.juliankominiak.quack.IQuackBehaviour;

public class Duck {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;
    private IDisplayBehaviour displayBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void display() {
        this.displayBehaviour.display();
    }
}
