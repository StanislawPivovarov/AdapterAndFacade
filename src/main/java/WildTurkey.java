import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.FactoryRegistry;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.imageio.stream.FileImageInputStream;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("я не знаю, как написать, что говорит утка");


    }

    @Override
    public void fly() {
        System.out.println("Летаю на короткие расстояния!");

    }
}
