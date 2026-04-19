package ISP.followed;

public class Cube implements Shape_3D{
    
    private double side;
    
    public Cube(double side){
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double volume() {
        return side * side *side;
    }
}
