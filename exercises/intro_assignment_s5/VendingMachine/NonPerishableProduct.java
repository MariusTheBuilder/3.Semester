package intro_assignment_s5.VendingMachine;

public class NonPerishableProduct extends Product{
    public double bestBeforeDate;

    public NonPerishableProduct(String productName, double productPrice,
                                int productSlot, int productAmount, double bestBeforeDate) {

        super(productName, productPrice, productSlot, productAmount);
        this.bestBeforeDate = bestBeforeDate;
    }
}
