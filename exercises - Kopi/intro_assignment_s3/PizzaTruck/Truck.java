package intro_assignment_s3.PizzaTruck;

public class Truck {
    private String maker;
    private String model;
    private int year;
    private int wheels;

    public Truck(String maker, String model, int year, int wheels){
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
    }
    public String describe() {
        return year + " " + maker + " " + model + " (" + wheels + " wheels)";
    }
}
