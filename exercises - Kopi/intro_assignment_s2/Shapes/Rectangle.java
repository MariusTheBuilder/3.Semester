package intro_assignment_s2.Shapes;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return width * 2 + height * 2;
    }

    public double area(){
        return width * height;
    }
}
