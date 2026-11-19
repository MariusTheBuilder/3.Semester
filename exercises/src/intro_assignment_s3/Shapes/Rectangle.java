package intro_assignment_s3.Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double circumference() {
        return 2 * (width + height);
    }

    @Override
    public int edges() {
        return 4;
    }
}
