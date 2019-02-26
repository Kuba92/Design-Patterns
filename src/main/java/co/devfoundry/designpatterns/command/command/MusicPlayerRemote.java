package co.devfoundry.designpatterns.command.command;

public class MusicPlayerRemote {

    private MusicPlayerCommand command;

    public void setCommand(MusicPlayerCommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.play();
    }
}
