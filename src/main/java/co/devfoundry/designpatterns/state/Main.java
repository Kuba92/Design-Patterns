package co.devfoundry.designpatterns.state;

import co.devfoundry.designpatterns.state.state.SlotMachine;

public class Main {

    public static void main(String[] args) {

        SlotMachine machine = new SlotMachine();

        machine.insertTheCoin();
        machine.currentState();
        machine.pushTheLever();
        machine.currentState();
        machine.collectTheWinnings();
        machine.currentState();
    }
}
