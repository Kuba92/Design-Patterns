package co.devfoundry.designpatterns.visitor.visitor;

import co.devfoundry.designpatterns.visitor.transport.Animal;
import co.devfoundry.designpatterns.visitor.transport.Person;
import co.devfoundry.designpatterns.visitor.transport.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
