package co.devfoundry.designpatterns.visitor;

import co.devfoundry.designpatterns.visitor.transport.Animal;
import co.devfoundry.designpatterns.visitor.transport.Person;
import co.devfoundry.designpatterns.visitor.transport.Shipment;
import co.devfoundry.designpatterns.visitor.transport.Transportable;
import co.devfoundry.designpatterns.visitor.visitor.NameTransportVisitor;
import co.devfoundry.designpatterns.visitor.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Kuba", "Czapiewski", true);
        Shipment shipment = new Shipment("PL", "4654", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
        System.out.println("------------------------------------");
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
    }
}
