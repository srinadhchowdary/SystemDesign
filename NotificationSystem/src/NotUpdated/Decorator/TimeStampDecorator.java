package NotUpdated.Decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampDecorator extends INotificationDecorator{
    
    public TimeStampDecorator(INotification n){
        super(n);
    }
    
    @Override
    public String getContent() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentTime = now.format(formatter);
        return  "[" + currentTime + "] " + notification.getContent();
    }
    
}
