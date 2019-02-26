package co.devfoundry.designpatterns.factory;


import co.devfoundry.designpatterns.factory.factory.AudiModel;
import co.devfoundry.designpatterns.factory.factory.BMWModel;
import co.devfoundry.designpatterns.factory.factory.Car;

public class Main {

    public static void main(String[] args) {

        Factory europe = new EuropeFactory();
        Factory uk = new UKFactory();

        Car audi = europe.buildAudi(AudiModel.R8);
        Car bmw = uk.buildBMW(BMWModel.M5);

        System.out.println(audi.getPosition());
        System.out.println(bmw.getPosition());

    }
}
