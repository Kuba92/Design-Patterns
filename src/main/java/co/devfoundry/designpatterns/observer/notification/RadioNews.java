package co.devfoundry.designpatterns.observer.notification;

import co.devfoundry.designpatterns.observer.weather.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - Temperatura będzie dziś wynosiła: " + weatherForecast.getTemperature() +
                "C, a ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
