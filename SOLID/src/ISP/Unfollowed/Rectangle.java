package ISP.Unfollowed;

public class Rectangle implements Shape {
    
    private double length,width;
    
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume is not supported for Rectangle");

    }
}
