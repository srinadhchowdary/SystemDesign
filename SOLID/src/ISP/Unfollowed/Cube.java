package ISP.Unfollowed;

public class Cube implements Shape{
    
    private double side;
    
    public Cube(double s){
        this.side = s;
    }
    
    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
