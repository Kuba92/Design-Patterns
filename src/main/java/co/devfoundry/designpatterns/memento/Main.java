package co.devfoundry.designpatterns.memento;

import co.devfoundry.designpatterns.memento.system_backup.OperatingSystem;
import co.devfoundry.designpatterns.memento.system_backup.OperatingSystemCaretaker;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystemCaretaker.addMemento(operatingSystem.save());

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.createBackup();
        Thread.sleep(3000);

        operatingSystem.load(operatingSystemCaretaker.getMemento());

    }
}
