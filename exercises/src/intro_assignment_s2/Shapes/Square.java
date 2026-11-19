package intro_assignment_s2.Shapes;

public class Square {
    private double width;

    public Square (double width){
        this.width = width;
    }

    public double perimeter() {
        return width * 4;
    }

    public double area(){
        return width * width;
    }
}