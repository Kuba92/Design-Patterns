package co.devfoundry.designpatterns.factory.factory;

public abstract class Car {

    private String engine;

    private int productionYear;

    private String fuel;

    private SteeringWheelPosition position;

    protected Car(String engine, int prodyctionYear, String fuel, SteeringWheelPosition position) {
        this.engine = engine;
        this.productionYear = prodyctionYear;
        this.fuel = fuel;
        this.position = position;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
