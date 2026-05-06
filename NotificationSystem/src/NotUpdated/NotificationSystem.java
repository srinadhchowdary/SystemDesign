import Decorator.INotification;
import Decorator.SignatureDecorator;
import Decorator.SimpleNotification;
import Decorator.TimeStampDecorator;
import Observer.Logger;
import Observer.NotificationEngine;
import Observer.NotificationObservable;
import Service.NotificationService;
import Strategy.EmailStrategy;
import Strategy.PopUpStrategy;
import Strategy.SMSStrategy;

public class NotificationSystem {
    public static void main(String[] args) {

        // Create NotificationService.
        NotificationService notificationService = NotificationService.getInstance();

        // Get Observable
        NotificationObservable notificationObservable = notificationService.getObservable();

        // Create Logger Observer
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