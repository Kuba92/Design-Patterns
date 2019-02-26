package co.devfoundry.designpatterns.state.state;

public class WinState implements State {

    public void insertTheCoin(SlotMachine machine) {
        System.out.println("Najpierw odbierz wyraną!");
    }

    public void pushTheLever(SlotMachine machine) {
        System.out.println("Najpierw odbierz wyraną!");
    }

    public void collectTheWinnings(SlotMachine machine) {
        System.out.println("Odebrano nagrodę!");
        machine.state = new NoCoinState();
    }

    public void currentState(SlotMachine machine) {
        System.out.println("Aktualny stan - WYGRANA!");
    }
}
