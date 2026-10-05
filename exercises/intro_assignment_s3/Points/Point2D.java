package intro_assignment_s3.Points;

public class Point2D {
        protected double x_coordinate;
        protected double y_coordinate;

        public Point2D(double x_coordinate, double y_coordinate){
                this.x_coordinate = x_coordinate;
                this.y_coordinate = y_coordinate;
        }

        @Override
        public String toString() {
                return "(" + x_coordinate + ", " + y_coordinate + ")";
        }
}