package WalkableRobot;

public class NoWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Cannot Walk.");
    }
}
