package intro_assignment_s5.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        System.out.println();

        PerishableProduct item1 = new PerishableProduct
                ("Burrito", 35, 1, 0, 20.12);
        PerishableProduct item2 = new PerishableProduct
                ("Sandwich", 30, 2, 0, 22.12);
        NonPerishableProduct item3 = new NonPerishableProduct
                ("Doritos", 25, 3, 0, 20.06);
        NonPerishableProduct item4 = new NonPerishableProduct
                ("Click-Mix", 20, 4, 0, 20.09);
        PerishableBottledProduct item5 = new PerishableBottledProduct
                ("Ginger-shots", 15, 5, 0, 20.09, 75);
        PerishableBottledProduct item6 = new PerishableBottledProduct
                ("Milk", 10, 6, 0, 20.09, 1000);
        NonPerishableBottledProduct item7 = new NonPerishableBottledProduct
                ("White monster", 14, 7, 0, 20.09, 500);
        NonPerishableBottledProduct item8 = new NonPerishableBottledProduct
                ("White monster L", 22, 8, 0, 20.09, 750);

        Product[] items = {item1, item2, item3, item4, item5, item6, item7, item8};


        System.out.println("Daily stock status:");
        for (Product item : items) {
            System.out.println(item.productName + ": " + item.productAmount + " in stock.");
        }
        System.out.println();

        System.out.println("Restocks of the day:");
        item1.restockProduct();
        item2.restockProduct();
        item3.restockProduct();
        item4.restockProduct();
        item5.restockProduct();
        item6.restockProduct();
        item7.restockProduct();
        item8.restockProduct();
        System.out.println();



        item1.purchaseProduct();
        item2.purchaseProduct();
        item1.purchaseProduct();
        item4.purchaseProduct();
        item1.purchaseProduct();
        item2.purchaseProduct();
        item3.purchaseProduct();
    }
}
