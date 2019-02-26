package co.devfoundry.designpatterns.chain_of_responsibility.children;

import co.devfoundry.designpatterns.chain_of_responsibility.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
