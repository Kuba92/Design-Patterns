package co.devfoundry.designpatterns.memento.system_backup;

import java.util.Date;

public class OperatingSystemMemento {

    public int backupNumber;

    public Date backupDate;

    public OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    public int getBackupNumber() {
        return backupNumber;
    }

    public Date getBackupDate() {
        return backupDate;
    }
}
