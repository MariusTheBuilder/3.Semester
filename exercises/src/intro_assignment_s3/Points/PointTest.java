package intro_assignment_s3.Points;

public class PointTest {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1, 2);
        Point3D p3 = new Point3D(1, 2, 3);
        ColoredPoint3D cp3 = new ColoredPoint3D(1, 2, 3, "red");

        System.out.println(p2);
        System.out.println(p3);
        System.out.println(cp3);
    }
}
