import FlyableRobot.NoFly;
import FlyableRobot.NormalFly;
import TalkableRobot.NoTalk;
import TalkableRobot.NormalTalk;
import WalkableRobot.NoWalk;
import WalkableRobot.NormalWalk;

public class StrategyDesignPattern {
    public static void main(String[] args) {
        
        Robot robot1 = new CompanionRobot(new NormalWalk(),new NormalTalk(),new NormalFly());
        robot1.walk();
        robot1.talk();
        robot1.fly();
        robot1.projection();

        System.out.println("-----------------------------");
        
        Robot robot2 = new WorkerRobot(new NormalWalk() , new NoTalk(), new NormalFly());
        robot2.walk();
        robot2.talk();
        robot2.fly();
        robot2.projection();

        System.out.println("-----------------------------");
        
        Robot robot3 = new CompanionRobot(new NoWalk() , new NoTalk() , new NoFly());
        robot3.walk();
        robot3.talk();
        robot3.fly();
        robot3.projection();

        System.out.println("-----------------------------");
        
        Robot robot4 = new CompanionRobot(new NormalWalk(),new NormalTalk(),new NoFly());
        robot4.walk();
        robot4.talk();
        robot4.fly();
        robot4.projection();
    }
}