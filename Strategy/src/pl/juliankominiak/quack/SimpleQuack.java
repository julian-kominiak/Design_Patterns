package pl.juliankominiak.quack;

public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Simple Quack");
    }
}
