package intro_assignment_s5.VendingMachine;

public class PerishableProduct extends Product{
    public double expirationDate;

    public PerishableProduct(String productName, double productPrice,
                             int productSlot, int productAmount, double expirationDate){

        super(productName, productPrice, productSlot, productAmount);
        this.expirationDate = expirationDate;
    }
}
