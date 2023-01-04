package Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void Display() {
        System.out.println("I'm a mallard duck...");
    }
}
