package co.devfoundry.designpatterns.visitor.transport;

import co.devfoundry.designpatterns.visitor.visitor.TransportVisitor;

public class Animal implements Transportable{

    private String kind;
    private int weight;

    public Animal(String kind, int weight) {
        this.kind = kind;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void accept(TransportVisitor visitor) {
        visitor.visit(this);
    }
}
