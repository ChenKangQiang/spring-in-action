package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import soundsystem.api.CompactDisc;
import soundsystem.api.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
