package co.devfoundry.designpatterns.chain_of_responsibility.children;

import co.devfoundry.designpatterns.chain_of_responsibility.request.MotherRequest;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Tomek zdjął słoik z szafki");
        }
        else {
            System.out.println("Za wysoko!");
        }
    }
}
