package ISP.followed;

public class Rectangle implements Shape_2D{
    
    private double length,breadth;
    
    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length * breadth;
    }
}
