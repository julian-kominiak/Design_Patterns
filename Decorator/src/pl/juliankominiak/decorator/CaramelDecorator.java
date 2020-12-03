package pl.juliankominiak.decorator;

import pl.juliankominiak.beverage.Beverage;

public class CaramelDecorator extends AddonDecorator {
    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 1;
    }
}
