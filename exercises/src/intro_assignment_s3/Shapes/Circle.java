package intro_assignment_s3.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public int edges() {
        return 0;
    }
}

