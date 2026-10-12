package intro_assignment_s3.PizzaTruck;

public class PizzaTruck extends Truck{
    private Kitchen kitchen; // composition instead of inheritance

    public PizzaTruck(String maker, String model, int year, int wheels){
        super(maker, model, year, wheels);
        this.kitchen = new Kitchen();
    }

    public String makeMargherita() {
        return kitchen.makeMargherita();
    }

    public String makePepperoni() {
        return kitchen.makePepperoni();
    }

    public String makeVeggie() {
        return kitchen.makeVeggie();
    }
}
