package intro_assignment_s2.Shapes;

public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double circumference() {
        return radius * 2 * Math.PI;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
