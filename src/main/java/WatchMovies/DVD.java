package WatchMovies;

public class DVD {
    public void on(String movie){
        System.out.println("DVD включен");
        System.out.println("Установлен фильм " + movie);
    }

    public void off(){
        System.out.println("Выключение DVD");
    }
}
