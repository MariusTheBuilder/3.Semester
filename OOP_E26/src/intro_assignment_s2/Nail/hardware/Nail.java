package intro_assignment_s2.Nail.hardware;

public class Nail {
    private double length;
    private double thickness;

    public Nail (double length, double thickness){
        this.length = length;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "This metal nail has length: " + length + " and thickness: " + thickness;
    }
}
