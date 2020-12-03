package pl.juliankominiak.decorator;

import pl.juliankominiak.beverage.Beverage;

public class SugarDecorator extends AddonDecorator {
    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 1;
    }
}
