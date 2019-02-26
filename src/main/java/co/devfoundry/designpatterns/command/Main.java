package co.devfoundry.designpatterns.command;

import co.devfoundry.designpatterns.command.command.MusicPlayerRemote;
import co.devfoundry.designpatterns.command.command.PlayFirstTrack;
import co.devfoundry.designpatterns.command.command.PlayNextTrack;
import co.devfoundry.designpatterns.command.command.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setCommand(new PlayFirstTrack(player));
        remote.pressButton();
        remote.setCommand(new PlayNextTrack(player));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setCommand(new PlayRandomTrack(player));
        remote.pressButton();
        remote.pressButton();
    }
}
