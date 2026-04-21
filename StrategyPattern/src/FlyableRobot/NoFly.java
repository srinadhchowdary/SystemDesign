package FlyableRobot;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cannot fly.");
    }
}
