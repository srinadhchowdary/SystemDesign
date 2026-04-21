import FlyableRobot.Flyable;
import TalkableRobot.Talkable;
import WalkableRobot.Walkable;

public class WorkerRobot extends Robot{
    
    public WorkerRobot(Walkable w, Talkable t , Flyable f){
        super(w,t,f);
    }
    
    @Override
    public void projection() {
        System.out.println("Displaying worker efficiency stats...");
    }
}
