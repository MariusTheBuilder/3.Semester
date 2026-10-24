package intro_assignment_s5.VendingMachine;

public class Slot {
    private final Product product;
    private int quantity;

    Slot(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
