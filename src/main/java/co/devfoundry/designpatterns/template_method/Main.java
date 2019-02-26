package co.devfoundry.designpatterns.template_method;

public class Main {

    public static void main(String[] args) {

        WeekDay day = new MyDay();
        day.everyDayIsExactlyTheSame(TransportType.CAR);
        System.out.println();
        day.everyDayIsExactlyTheSame(TransportType.BIKE);
        System.out.println();
        day.everyDayIsExactlyTheSame(TransportType.TRAM);
    }
}
