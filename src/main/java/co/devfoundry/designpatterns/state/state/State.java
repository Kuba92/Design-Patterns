package co.devfoundry.designpatterns.state.state;

public interface State {

    void insertTheCoin(SlotMachine machine);
    void pushTheLever(SlotMachine machine);
    void collectTheWinnings(SlotMachine machine);
    void currentState(SlotMachine machine);
}
