package co.devfoundry.designpatterns.state.state;

public class NoCoinState implements State {

    public void insertTheCoin(SlotMachine machine) {
        System.out.println("Włożono monetę");
        machine.state = new CoinInsertedState();
    }

    public void pushTheLever(SlotMachine machine) {
        System.out.println("Najpierw wrzuć monetę!");
    }

    public void collectTheWinnings(SlotMachine machine) {
        System.out.println("Nic nie wygrałeś, bo nie wrzuciłeś monety!");
    }

    public void currentState(SlotMachine machine) {
        System.out.println("Brak monety - gra nierozpoczęta");
    }
}
