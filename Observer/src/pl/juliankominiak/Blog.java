package pl.juliankominiak;

import java.util.Observable;
import java.util.Observer;

public class Blog implements Observer {
    private String name;

    public Blog(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Posting to the " + this.name + " about the video: "
                + arg + " by " + ((YouTubeChannel) o).getName());
    }
}
