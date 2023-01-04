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

    public void SetFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void SetQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
