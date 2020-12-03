package pl.juliankominiak.decorator;

import pl.juliankominiak.beverage.Beverage;

public class SoyMilkDecorator extends AddonDecorator {
    public SoyMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 1;
    }
}
