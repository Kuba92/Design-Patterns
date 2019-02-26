package co.devfoundry.designpatterns.template_method;

public abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TransportType type) {
        wakeUp();
        getReady();
        int time = goToWork(type);
        summary(time);
        work();
        goHome(type);
    }

    private void wakeUp() {
        System.out.println("Pobudka!");
    }

    private void getReady() {
        System.out.println("Przygotowuję się do wyjścia");
    }

    protected abstract int goToWork(TransportType type);

    private void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    protected abstract void work();

    private void goHome(TransportType type) {
        System.out.println("Idę do domu");
    }
}
