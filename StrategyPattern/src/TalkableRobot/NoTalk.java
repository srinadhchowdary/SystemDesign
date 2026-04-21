package TalkableRobot;

public class NoTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Cannot Talk.");
    }
}
