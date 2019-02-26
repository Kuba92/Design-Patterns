package co.devfoundry.designpatterns.chain_of_responsibility.request;

import co.devfoundry.designpatterns.chain_of_responsibility.children.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
