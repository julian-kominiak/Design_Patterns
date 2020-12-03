package pl.juliankominiak.quack;

public class NoQuack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("...");
    }
}
