package intro_assignment_s3.Points;

public class ColoredPoint3D extends Point3D {
    protected String color;

    public ColoredPoint3D(double x_coordinate, double y_coordinate, double z_coordinate, String color) {
        super(x_coordinate, y_coordinate, z_coordinate);
        this.color = color;
    }
        @Override
        public String toString() {
            return "(" + x_coordinate + ", " + y_coordinate + ", " + z_coordinate + ") in " + color;
        }
}
