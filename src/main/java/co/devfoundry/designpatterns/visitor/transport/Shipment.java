package co.devfoundry.designpatterns.visitor.transport;

import co.devfoundry.designpatterns.visitor.visitor.TransportVisitor;

public class Shipment implements Transportable{

    private String prefix;
    private String serialNumber;
    private boolean isLarge;

    public Shipment(String prefix, String serialNumber, boolean isLarge) {
        this.prefix = prefix;
        this.serialNumber = serialNumber;
        this.isLarge = isLarge;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }

    public void setLarge(boolean large) {
        isLarge = large;
    }

    public void accept(TransportVisitor visitor) {
        visitor.visit(this);
    }
}
