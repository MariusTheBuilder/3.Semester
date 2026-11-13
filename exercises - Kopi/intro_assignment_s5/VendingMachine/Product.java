package intro_assignment_s5.VendingMachine;

public abstract class Product {
    public String productName;
    public double productPrice;
    public int productSlot;
    public int productAmount;

    public Product(String productName, double productPrice, int productSlot, int productAmount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSlot = productSlot;
        this.productAmount = productAmount;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductSlot() {
        return productSlot;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void restockProduct(){
        productAmount += 5;
        System.out.println(productName + " has been restocked!");
    }

    public void purchaseProduct(){
        if (productAmount <= 0){
            System.out.println(productName + " is sold out!");
        } else if (productAmount == 1){
            productAmount--;
            System.out.println(productName + " purchased! Enjoy!" + "\n" + productName + " is now sold out!");
        } else {
            productAmount--;
            System.out.println(productName + " purchased! Enjoy!");
        }
    }
}
