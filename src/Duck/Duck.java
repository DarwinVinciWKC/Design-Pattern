package Duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void Display();

    public void PerformFly() {
        flyBehavior.Fly();
    }

    public void PerformQuack() {
        quackBehavior.Quack();
    }

    public void Swim() {
        System.out.println("I can swim.");
    }
}
