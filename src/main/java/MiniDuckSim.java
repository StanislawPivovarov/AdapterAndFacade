//сделать работу через spring!

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class MiniDuckSim {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Turkey says");
        turkey.gobble();
        turkey.fly();


    }
}
