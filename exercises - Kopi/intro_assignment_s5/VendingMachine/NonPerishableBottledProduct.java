package intro_assignment_s5.VendingMachine;

public class NonPerishableBottledProduct extends NonPerishableProduct implements Bottled {
    public int millilitres;

    public NonPerishableBottledProduct(String productName, double productPrice,
                                    int productSlot, int productAmount, double bestBeforeDate, int millilitres) {

        super(productName, productPrice, productSlot, productAmount, bestBeforeDate);
        this.millilitres = millilitres;
    }

    @Override
    public int getNumberOfMillilitres() {
        return millilitres;
    }
}
