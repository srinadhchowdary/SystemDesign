import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{
    
    
    private List<ISubscriber> subscribers;
    private String name;
    private String latestVideo;
    
    public Channel(String name){
        this.name = name;
        this.subscribers = new ArrayList<>();
    }
    
    @Override
    public void subscribe(ISubscriber subscriber) {
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
            System.out.println(subscriber.getName() + " subscribed to " + name);

        }
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        if(subscribers.contains(subscriber)){
            System.out.println(subscriber.getName() + " unsubscribed to " + name);
            subscribers.remove(subscriber);
        }
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber sub : subscribers){
            sub.update();
        }
    }
    
    public void uploadVideo(String title){
        latestVideo = title;
        System.out.println("\n[" + name + " uploaded \""+ title + "\"]");
        notifySubscribers();
    }
    
    public String getVideoData(){
        return "\n Checkout our new Video : "+ latestVideo + "\n";
    }
}
