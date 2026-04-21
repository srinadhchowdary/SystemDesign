import FlyableRobot.Flyable;
import TalkableRobot.Talkable;
import WalkableRobot.Walkable;

public abstract class Robot {
    
    private Walkable walkable;
    private Talkable talkable;
    private Flyable flyable;
    
    public Robot(Walkable walkable,Talkable talkable, Flyable flyable){
        this.walkable = walkable;
        this.talkable = talkable;
        this.flyable = flyable;
    }
    
    
    public void walk(){
        walkable.walk();
    }
    
    public void talk(){
        talkable.talk();
    }
    
    public void fly(){
        flyable.fly();
    }
    
    public abstract void projection();
}
