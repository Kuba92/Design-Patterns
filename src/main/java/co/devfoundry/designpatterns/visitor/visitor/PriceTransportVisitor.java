package co.devfoundry.designpatterns.visitor.visitor;

import co.devfoundry.designpatterns.visitor.transport.Animal;
import co.devfoundry.designpatterns.visitor.transport.Person;
import co.devfoundry.designpatterns.visitor.transport.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    public void visit(Animal animal) {
        System.out.println("Cena za kilometr dla zwierzecia: " + animal.getWeight() * 0.2 + "zł");
    }

    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Cena za kilometr dla osoby: " + price + "zł");
    }

    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price = price * 3;
        }
        System.out.println("Cena transportu paczki to: " + price +"zł");
    }
}