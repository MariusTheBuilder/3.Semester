package intro_assignment_s3.PizzaTruck;

public class PizzaTruckTest {
    public static void main(String[] args) {
        PizzaTruck truck = new PizzaTruck("Mercedes", "PZ2000", 2003, 6);

        System.out.println(truck.describe());
        System.out.println(truck.makeMargherita());
        System.out.println(truck.makePepperoni());
    }
}
