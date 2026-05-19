package NotUpdated.Strategy;

public class SMSStrategy implements INotificationStrategy{
    
    
    private String mobileNumber;
    
    public SMSStrategy(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending SMS Notification to :" + mobileNumber + "\n" + content);
        
    }
}
