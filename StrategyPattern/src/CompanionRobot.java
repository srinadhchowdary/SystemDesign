import FlyableRobot.Flyable;
import TalkableRobot.Talkable;
import WalkableRobot.Walkable;

public class CompanionRobot extends Robot{
    
    public CompanionRobot(Walkable w , Talkable t , Flyable f){
        super(w,t,f);
    }
    
    @Override
    public void projection() {
        System.out.println("Displaying friendly Companion features...");
    }
}
