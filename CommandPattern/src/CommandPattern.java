import ConcreteCommands.FanCommand;
import ConcreteCommands.LightCommand;
import Receivers.Fan;
import Receivers.Light;

public class CommandPattern {
    public static void main(String[] args) {
        
        Light livingRoomlight = new Light();
        Fan ceilingFan = new Fan();
        
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,new LightCommand(livingRoomlight));
        remoteController.setCommand(1,new FanCommand(ceilingFan));

        System.out.println("---- Toggling Light Button 0 ----");
        remoteController.pressButton(0);
        remoteController.pressButton(0);

        System.out.println("---- Toggling Fan Button 1 ----");
        remoteController.pressButton(1);
        remoteController.pressButton(1);

        System.out.println("---- Pressing Unassigned Button 2 ----");
        remoteController.pressButton(2);
    }
}