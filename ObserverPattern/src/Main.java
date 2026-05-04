public class Main {
    public static void main(String[] args) {
        
        Channel channel = new Channel("CoderArmy");
        
        Subscriber  subs1 = new Subscriber("Varun" , channel);
        Subscriber  subs2 = new Subscriber("Kiran", channel);


        channel.subscribe(subs1);
        channel.subscribe(subs2);
        
        channel.uploadVideo("Observer Pattern Tutorial");
        
        channel.unsubscribe(subs2);
        
        channel.uploadVideo("Decorator Pattern Tutorial");
    }
}