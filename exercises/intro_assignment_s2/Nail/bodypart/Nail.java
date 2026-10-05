package intro_assignment_s2.Nail.bodypart;

public class Nail {
    private double length;
    private double width;
    private String color;

    // No color.
    public Nail (double length, double width) {
        this(length, width, null);
    }

    // Full description
    public Nail (double length, double width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "This fingernail has length: " + length + ", width: " + width
                + ", and color: " + (color != null ? color : "none");
    }
}
