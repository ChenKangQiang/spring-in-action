package soundsystem;

import org.springframework.stereotype.Component;
import soundsystem.api.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String play() {
        return "Playing " + title + " by " + artist;
    }

}
