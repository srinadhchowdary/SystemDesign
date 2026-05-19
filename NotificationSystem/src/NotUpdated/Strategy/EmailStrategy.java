package NotUpdated.Strategy;

public class EmailStrategy implements INotificationStrategy{
    
    private String EmailId;
    
    public EmailStrategy(String emailId){
        this.EmailId = emailId;
    }
    
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Email Notification to: "+ EmailId + "\n" + content);
    }
}
