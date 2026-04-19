package ISP.followed;

public class Square implements Shape_2D {
    
    private double side;
    
    public Square(double side){
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }
}
