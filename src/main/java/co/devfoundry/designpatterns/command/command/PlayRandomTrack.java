package co.devfoundry.designpatterns.command.command;

import co.devfoundry.designpatterns.command.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    private MusicPlayer player;

    public PlayRandomTrack(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playRandomTrack();
    }
}
