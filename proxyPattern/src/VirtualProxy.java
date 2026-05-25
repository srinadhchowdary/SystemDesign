public class VirtualProxy {
    public static void main(String[] args) {
        
        IImage image1 = new ImageProxy("sample.jpg");
        image1.display();
    }
}