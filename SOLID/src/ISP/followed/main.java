package ISP.followed;

public class main {

    public static void main(String[] args) {

        Shape_2D square = new Square(5);
        Shape_2D rectangle = new Rectangle(5, 6);
        Shape_3D cube = new Cube(5);

        System.out.println("Square Area: " + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: " + cube.area());
        System.out.println("Cube Volume: " + cube.volume());
        
    }
}
