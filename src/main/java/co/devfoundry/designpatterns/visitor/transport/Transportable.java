package co.devfoundry.designpatterns.visitor.transport;

import co.devfoundry.designpatterns.visitor.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor visitor);
}
