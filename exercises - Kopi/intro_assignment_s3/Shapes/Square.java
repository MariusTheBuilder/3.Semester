package intro_assignment_s3.Shapes;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double circumference() {
        return 4 * side;
    }

    @Override
    public int edges() {
        return 4;
    }
}