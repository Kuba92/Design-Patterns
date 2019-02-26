package co.devfoundry.designpatterns.memento.system_backup;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;

    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup systemu o numerze: " + this.backupNumber + " z datą: " + this.backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento memento) {
        this.backupNumber = memento.getBackupNumber();
        this.backupDate = memento.getBackupDate();
    }
}
