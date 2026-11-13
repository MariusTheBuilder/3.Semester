package intro_assignment_s5.VendingMachine;

public class PerishableBottledProduct extends PerishableProduct implements Bottled {
    public int millilitres;

    public PerishableBottledProduct(String productName, double productPrice,
                                    int productSlot, int productAmount, double expirationDate, int millilitres) {

        super(productName, productPrice, productSlot, productAmount, expirationDate);
        this.millilitres = millilitres;
    }

    @Override
    public int getNumberOfMillilitres() {
        return millilitres;
    }
}
