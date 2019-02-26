package co.devfoundry.designpatterns.command.command;

import co.devfoundry.designpatterns.command.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer player;

    public PlayNextTrack(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playNextTrack();
    }
}
