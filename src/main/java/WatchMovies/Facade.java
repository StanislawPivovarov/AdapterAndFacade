package WatchMovies;

public class Facade {
    Amplifier amp;
    DVD dvd;
    Projector projector;
    Light lights;
    Screen screen;
    Popcorn popper;

    public Facade(Amplifier amp,
                  DVD dvd,
                  Light lights,
                  Popcorn popper,
                  Projector projector,
                  Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.lights = lights;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
    }

    public void start(String movie) {
        System.out.println("------------------ Начало просмотра ------------------");

        popper.on();
        popper.off();

        lights.dim(10);

        screen.down();

        projector.on("dvd");

        amp.on("DVD", 5);

        dvd.on(movie);
    }

    public void stop() {
        System.out.println("------------------ Конец просмотра ------------------");

        lights.inc(100);

        screen.up();

        projector.off();

        amp.off();

        dvd.off();
    }

}

