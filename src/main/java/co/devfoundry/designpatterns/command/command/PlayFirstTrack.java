package co.devfoundry.designpatterns.command.command;

import co.devfoundry.designpatterns.command.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private MusicPlayer player;

    public PlayFirstTrack(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playFirstTrack();
    }
}
