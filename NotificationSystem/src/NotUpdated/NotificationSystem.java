package NotUpdated;

import NotUpdated.Decorator.INotification;
import NotUpdated.Decorator.SignatureDecorator;
import NotUpdated.Decorator.SimpleNotification;
import NotUpdated.Decorator.TimeStampDecorator;
import NotUpdated.Observer.Logger;
import NotUpdated.Observer.NotificationEngine;
import NotUpdated.Observer.NotificationObservable;
import NotUpdated.Service.NotificationService;
import NotUpdated.Strategy.EmailStrategy;
import NotUpdated.Strategy.PopUpStrategy;
import NotUpdated.Strategy.SMSStrategy;

public class NotificationSystem {
    public static void main(String[] args) {

        // Create NotificationService.
        NotificationService notificationService = NotificationService.getInstance();

        // Get Observable
        NotificationObservable notificationObservable = notificationService.getObservable();

        // Create Logger NotUpdated.Observer
        Logger logger = new Logger(notificationObservable);

        NotificationEngine notificationEngine = new NotificationEngine(notificationObservable);
        
        notificationEngine.addNotificationStrategy(new EmailStrategy("random.person@gmail.com"));
        notificationEngine.addNotificationStrategy(new SMSStrategy("+91 6302705610"));
        notificationEngine.addNotificationStrategy(new PopUpStrategy());
        
        // Attach these Observers
        notificationObservable.addObserver(logger);
        notificationObservable.addObserver(notificationEngine);
        
        // create a notification with decorators
        INotification notification = new SimpleNotification("Your Order has been shipped..!");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification,"Customer Care");
        
        notificationService.sendNotification(notification);
        
        
    }
}