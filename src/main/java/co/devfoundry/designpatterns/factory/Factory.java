package co.devfoundry.designpatterns.factory;

import co.devfoundry.designpatterns.factory.factory.AudiModel;
import co.devfoundry.designpatterns.factory.factory.BMWModel;
import co.devfoundry.designpatterns.factory.factory.Car;

public interface Factory {

    Car buildAudi(AudiModel model);

    Car buildBMW(BMWModel model);
}
