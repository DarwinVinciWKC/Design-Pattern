package Duck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("Silence");
    }
}