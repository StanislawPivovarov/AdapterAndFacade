package WatchMovies;

public class Amplifier {
    public void on(String dvd, Integer volume){
        System.out.println("Усилитель включен");
        System.out.println("Установлен диск типа " + "'" + dvd + "'");
        System.out.println("Установлен реалистичный звук");
        System.out.println("Установлена громкость на " + volume + "/10");
    }

    public void off(){
        System.out.println("Выключение усилителя");
    }
}
