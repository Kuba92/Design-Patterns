package co.devfoundry.designpatterns.strategy.pricing_strategy;

public class RegularPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter) {
            System.out.println("Normalna cena: " + price + "zł");
        } else {
            System.out.println("Coś jest nie halo");
        }
    }
}
