package co.devfoundry.designpatterns.factory;


import co.devfoundry.designpatterns.factory.factory.*;

public class EuropeFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildAudi(AudiModel model) {
        switch (model) {
            case RS7:
                return new Audi("4.0", 2018, "diesel", position);

            case R8:
                return new Audi("5.2", 2019, "diesel", position);

            default:
                throw new IllegalArgumentException("Something went wrong!");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case M5:
                return new BMW("4.4", 2018, "diesel", position);

            case i8:
                return new BMW("1.5", 2019, "electric", position);

            default:
                throw new IllegalArgumentException("Something went wrong!");
        }
    }
}
