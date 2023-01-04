package Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.PerformFly();
        mallard.PerformQuack();
        mallard.Display();

        System.out.println("----------");

        Duck model = new ModelDuck();
        model.PerformFly();
        model.PerformQuack();
        model.SetFlyBehavior(new FlyRocketPowered());
        model.PerformFly();
        model.Display();
    }
}
