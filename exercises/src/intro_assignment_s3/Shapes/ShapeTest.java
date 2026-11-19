package intro_assignment_s3.Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(4),
                new Rectangle(3, 6),
                new Triangle(3, 4, 5),
                new Circle(2),
                new Line(10)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area(); // the loop never checks what kind of shape it is
        }

        System.out.println("Total area: " + totalArea);
    }
}
