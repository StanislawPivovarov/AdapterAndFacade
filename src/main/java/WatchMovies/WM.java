package WatchMovies;

public class WM {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVD dvd = new DVD();
        Light light = new Light();
        Popcorn popcorn = new Popcorn();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Facade facade = new Facade(amplifier, dvd, light, popcorn, projector, screen);
        
facade.start("Титаник");
facade.stop();

    }
}
