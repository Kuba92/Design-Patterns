package co.devfoundry.designpatterns.visitor.visitor;

import co.devfoundry.designpatterns.visitor.transport.Animal;
import co.devfoundry.designpatterns.visitor.transport.Person;
import co.devfoundry.designpatterns.visitor.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    public void visit(Animal animal) {
        System.out.println("Typ zwierzaka to: " + animal.getKind());
    }

    public void visit(Person person) {
        System.out.println("Imię osoby to: " + person.getFirstName()+ " " + person.getLastName());
    }

    public void visit(Shipment shipment) {
        System.out.println("Prefiks to: " + shipment.getPrefix() + " a numer seryjny: " + shipment.getSerialNumber());
    }
}
