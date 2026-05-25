package VirtualPattern;

public class RealImage implements IImage {
    
    private String fileName;
    
    public RealImage(String file){
        this.fileName = file;
        System.out.println("[VirtualPattern.RealImage] Loading image from disk " + fileName);
    }
    
    @Override
    public void display() {
        System.out.println("[VirtualPattern.RealImage] Displaying " + fileName);
    }
}
