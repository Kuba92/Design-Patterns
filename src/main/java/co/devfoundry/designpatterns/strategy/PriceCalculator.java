package co.devfoundry.designpatterns.strategy;

import co.devfoundry.designpatterns.strategy.pricing_strategy.PricingStrategy;

public class PriceCalculator {

    private PricingStrategy strategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.strategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }
}
