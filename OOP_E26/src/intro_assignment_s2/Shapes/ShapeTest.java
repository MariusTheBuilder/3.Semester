package intro_assignment_s2.Shapes;


public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Circumference: " + c.circumference() + ", Circle area: " + c.area());

        Square s = new Square(4);
        System.out.println("Square Perimeter: " + s.perimeter() + ", Square area: " + s.area());

        Rectangle r = new Rectangle(3, 3);
        System.out.println("Rectangle Perimeter: " + r.perimeter() + ", Rectangle area: " + r.area());
    }

}

