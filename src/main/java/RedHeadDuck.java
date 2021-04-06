public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehaviour = new FlyWithWings();

        FlyBehaviour flyBehaviour;

    }

    @Override
    public void display() {
        System.out.println("Я красноголовая утка");
    }
}
