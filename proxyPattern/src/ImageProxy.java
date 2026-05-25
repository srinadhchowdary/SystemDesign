public class ImageProxy implements IImage{
    
    private RealImage realImage;
    private String fileName;
    
    public ImageProxy(String file){
        this.fileName = file;
        this.realImage = null;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
