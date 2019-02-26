package co.devfoundry.designpatterns.observer.weather;

import co.devfoundry.designpatterns.observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
