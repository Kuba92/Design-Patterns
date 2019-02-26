package co.devfoundry.designpatterns.observer;

import co.devfoundry.designpatterns.observer.notification.InternetNews;
import co.devfoundry.designpatterns.observer.notification.RadioNews;
import co.devfoundry.designpatterns.observer.notification.TvNews;
import co.devfoundry.designpatterns.observer.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(30, 1115);

        InternetNews in = new InternetNews();

        RadioNews rn = new RadioNews();

        TvNews tn = new TvNews();

        weatherForecast.registerObserver(in);
        weatherForecast.registerObserver(rn);
        weatherForecast.registerObserver(tn);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(in);

        weatherForecast.changeWeatherForecast(123, 1234);

    }
}
