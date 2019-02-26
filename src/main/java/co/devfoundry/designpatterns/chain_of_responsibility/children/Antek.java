package co.devfoundry.designpatterns.chain_of_responsibility.children;


import co.devfoundry.designpatterns.chain_of_responsibility.request.MotherRequest;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Antek zdjął słoik z szafki");
        }
        else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
