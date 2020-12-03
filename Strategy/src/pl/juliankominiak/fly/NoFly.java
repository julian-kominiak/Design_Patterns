package pl.juliankominiak.fly;

import pl.juliankominiak.fly.IFlyBehaviour;

public class NoFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
