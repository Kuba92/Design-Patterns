package co.devfoundry.designpatterns.strategy;

import co.devfoundry.designpatterns.strategy.pricing_strategy.RegularPrice;
import co.devfoundry.designpatterns.strategy.pricing_strategy.SalePrice;

public class Main {
    public static void main(String[] args) {


        PriceCalculator calculator = new PriceCalculator();

        calculator.setStrategy(new RegularPrice());
        calculator.calculate(100, true);

        calculator.setStrategy(new RegularPrice());
        calculator.calculate(100, false);


        calculator.setStrategy(new SalePrice());
        calculator.calculate(100, true);

        calculator.setStrategy(new SalePrice());
        calculator.calculate(100, false);
    }
}
