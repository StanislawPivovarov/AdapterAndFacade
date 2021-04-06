package WatchMovies;

public class Projector {
    public void on(String input) {
        System.out.println("Проектор включен");
        System.out.println("Источник сигнала: " + input);
        System.out.println("Установлен широкоэкранный режим");
    }

    public void off(){
        System.out.println("Проектор в выключен");
    }
}
