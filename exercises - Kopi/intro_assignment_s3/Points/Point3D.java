package intro_assignment_s3.Points;

public class Point3D extends Point2D{
        protected double z_coordinate;

        public Point3D(double x_coordinate, double y_coordinate, double z_coordinate){
          super(x_coordinate, y_coordinate);
                this.z_coordinate = z_coordinate;
        }

        @Override
        public String toString() {
                return "(" + x_coordinate + ", " + y_coordinate + ", " + z_coordinate + ")";
        }
}
