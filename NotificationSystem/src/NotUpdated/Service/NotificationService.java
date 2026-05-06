package Service;

import Decorator.INotification;
import Observer.NotificationObservable;
import java.util.*;

public class NotificationService {
    
    private NotificationObservable observable;
    private static NotificationService instance;
    private List<INotification> notifications = new ArrayList<>();
    
    
    private NotificationService(){
        observable = new NotificationObservable();
    }
    
    public static NotificationService getInstance(){
        if(instance == null){
            instance = new NotificationService();
        }
        return instance;
    }
    
    public NotificationObservable getObservable(){
        return observable;
    }
    
    public void sendNotification(INotification notification){
        notifications.add(notification);
        observable.setNotification(notification);
    }
}
