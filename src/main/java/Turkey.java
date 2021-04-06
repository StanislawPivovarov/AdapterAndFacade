import javazoom.jl.decoder.JavaLayerException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface Turkey {
    public void gobble() throws IOException, UnsupportedAudioFileException, LineUnavailableException, JavaLayerException;
    public void fly();
}
