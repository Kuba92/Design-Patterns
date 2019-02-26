package co.devfoundry.designpatterns.memento.system_backup;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento memento) {
        System.out.println("Dodano backup o numerze: " + memento.getBackupNumber()+ " z datą: " + memento.getBackupDate());
        this.operatingSystemMemento = memento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + operatingSystemMemento.getBackupNumber()+ " z datą: " +
                operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
