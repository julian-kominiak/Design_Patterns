package pl.juliankominiak.decorator;

import pl.juliankominiak.beverage.Beverage;

public abstract class AddonDecorator extends Beverage {
    protected Beverage beverage;
}
