package ISP.Unfollowed;

public class main {

    public static void main(String[] args) {
        
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape cube = new Cube(3);

        System.out.println("Square Area: " + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: " + cube.area());
        System.out.println("Cube Volume: " + cube.volume());
        
        
        try{
            System.out.println("Square Volume: " + square.volume());
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}