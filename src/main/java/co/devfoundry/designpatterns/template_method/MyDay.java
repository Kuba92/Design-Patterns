package co.devfoundry.designpatterns.template_method;

public class MyDay extends WeekDay {

    protected int goToWork(TransportType type) {
        switch (type) {
            case CAR:
                return 10;
            case TRAM:
                return 15;
            case BIKE:
                return 25;
            default:
                return 50;
        }
    }

    protected void work() {
        System.out.println("Napierdalaj!");
    }
}
