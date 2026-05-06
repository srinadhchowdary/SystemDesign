package Observer;

import Decorator.INotification;
import Strategy.INotificationStrategy;

import java.util.*;

public class NotificationEngine implements IObserver{
    
    
    private NotificationObservable notificationObservable;
    private List<INotificationStrategy> notificationStrategyList = new ArrayList<>();
    
    public NotificationEngine(NotificationObservable observable){
        this.notificationObservable = observable;
    }
    
    public void addNotificationStrategy(INotificationStrategy ns){
        this.notificationStrategyList.add(ns);
    }
    
    @Override
    public void update() {
        
    }
}
