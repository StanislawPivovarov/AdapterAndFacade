public class RubberDuck extends Duck {


    public RubberDuck(){
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("... Резиновые утки не предстваляются...");
    }
}
