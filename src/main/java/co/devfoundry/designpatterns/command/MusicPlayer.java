package co.devfoundry.designpatterns.command;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");

    int currentTrackNumber = 0;

    public void playFirstTrack() {
        currentTrackNumber = 0;
        System.out.println("Gram teraz:" + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber >= tracks.size()) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram teraz: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random randomNumber = new Random();
        System.out.println("Gram teraz: " + tracks.get(randomNumber.nextInt(tracks.size())));
    }
}
