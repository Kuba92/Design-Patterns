package co.devfoundry.designpatterns.chain_of_responsibility;

import co.devfoundry.designpatterns.chain_of_responsibility.children.*;
import co.devfoundry.designpatterns.chain_of_responsibility.request.MotherRequest;

public class Main {

    public static void main(String[] args) {

        MotherRequest request = new MotherRequest(Shelf.HIGH);
        MotherRequest request1 = new MotherRequest(Shelf.LOW);
        MotherRequest request2 = new MotherRequest(Shelf.MEDIUM);

        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();

        ania.setTallerChild(antek);
        antek.setTallerChild(tomek);

        ania.processRequest(request);
        ania.processRequest(request1);
        ania.processRequest(request2);
    }
}
