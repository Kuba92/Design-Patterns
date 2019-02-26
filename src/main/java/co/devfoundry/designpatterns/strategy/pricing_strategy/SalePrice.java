package co.devfoundry.designpatterns.strategy.pricing_strategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Promocyjna cena: " + price/2 + "zł");
        } else {
            System.out.println("Coś jest nie halo");
        }
    }
}
