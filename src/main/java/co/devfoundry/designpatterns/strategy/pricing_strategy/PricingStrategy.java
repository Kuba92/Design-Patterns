package co.devfoundry.designpatterns.strategy.pricing_strategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
