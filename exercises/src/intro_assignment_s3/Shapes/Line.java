package intro_assignment_s3.Shapes;

public class Line extends Shape{
    private double length;

    public Line(double a) {
        this.length = length;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circumference() {
        return length;
    }

    @Override
    public int edges() {
        return 1;
    }
}
