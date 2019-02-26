package co.devfoundry.designpatterns.builder.flights;

public class FlightLeg {

    private String from;

    private String to;

    private boolean delayed;

    private int price;

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {

        private String from;

        private String to;

        private boolean delayed;

        private int price;

        public FlightLegBuilder builderFrom(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder builderTo(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder builderPrice(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (price == 0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }
}
