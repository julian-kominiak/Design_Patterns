package pl.juliankominiak;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class YouTubeChannel extends Observable {
    private String name;
    private List<String> videos;

    public YouTubeChannel(String name) {
        this.name = name;
        this.videos = new ArrayList<>();
    }

    public void uploadVideo(String videoTitle) {
        videos.add(videoTitle);
        setChanged();
        notifyObservers(videoTitle);
    }

    public String getName() {
        return name;
    }
}
