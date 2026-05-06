package Strategy;

public class PopUpStrategy implements INotificationStrategy{
    
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending PopUp Notification: \n"+ content);
    }
}
