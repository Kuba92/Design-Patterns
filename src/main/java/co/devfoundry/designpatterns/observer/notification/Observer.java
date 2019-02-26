package co.devfoundry.designpatterns.observer.notification;

import co.devfoundry.designpatterns.observer.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
