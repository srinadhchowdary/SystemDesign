package ISP.Unfollowed;

public class Square implements Shape{
    
    private double side;
    
    public Square(double s){
        this.side = s;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume is not supported for Square");
    }
}
