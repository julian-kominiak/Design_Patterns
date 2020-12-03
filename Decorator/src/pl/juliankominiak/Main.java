package pl.juliankominiak;

import pl.juliankominiak.beverage.Beverage;
import pl.juliankominiak.beverage.Espresso;
import pl.juliankominiak.beverage.Tea;
import pl.juliankominiak.decorator.CaramelDecorator;
import pl.juliankominiak.decorator.SoyMilkDecorator;
import pl.juliankominiak.decorator.SugarDecorator;

public class Main {

    public static void main(String[] args) {
        Beverage espressoWithSoyMilk = new CaramelDecorator(new SoyMilkDecorator(new Espresso()));
        System.out.println(espressoWithSoyMilk.cost());
        Beverage tea = new SugarDecorator(new Tea());
        System.out.println(tea.cost());
    }
}
