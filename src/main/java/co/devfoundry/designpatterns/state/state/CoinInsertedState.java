package co.devfoundry.designpatterns.state.state;

import java.util.Random;

public class CoinInsertedState implements State {

    private final static Random random = new Random();

    public void insertTheCoin(SlotMachine machine) {
        System.out.println("Moneta już jest w automacie!");
    }

    public void pushTheLever(SlotMachine machine) {
        System.out.println("Losowanie!");
        int result = random.nextInt(99);
        if (result < 15) {
            System.out.println("Grauluję, wygrałeś!");
            machine.state = new WinState();
        } else {
            System.out.println("Niestety się nie udało. Spróbuj ponownie!");
            machine.state = new NoCoinState();
        }
    }

    public void collectTheWinnings(SlotMachine machine) {
        System.out.println("Pociągnij za dźwignię, aby sprawdzić swoje szczęście!");
    }

    public void currentState(SlotMachine machine) {
        System.out.println("Aktualny stan - wrzucono monetę!");
    }
}
