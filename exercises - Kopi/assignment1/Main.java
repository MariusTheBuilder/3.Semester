package assignment1;

// Main has the method main and nothing else, and Main.main tells the same month as FlatShare.main.

public class Main {
    public static void main(String[] args) {
        System.out.println("September in the flat");

        Flat flat = new Flat();

        flat.moveIn("Freja", 14);
        flat.moveIn("Ali", 12);
        flat.moveIn("Mathilde", 10);
        flat.moveIn("Jonas", 14);

        flat.addExpense('R', "Freja", 10000, "Rent", null);
        flat.addExpense('E', "Mathilde", 480, "Groceries", null);
        flat.addExpense('E', "Jonas", 320, "Internet", null);
        flat.addExpense('P', "Ali", 450, "Concert ticket for Jonas", "Jonas");

        // Mathilde pays Freja back and moves out. Then Sofie moves in.
        flat.addExpense('P', "Mathilde", 1720, "Paying Freja back", "Freja");
        flat.moveOut("Mathilde");
        flat.moveIn("Sofie", 10);
        flat.addExpense('E', "Sofie", 200, "Cleaning supplies", null);

        // Jonas wants to move out too, and still owes money.
        flat.moveOut("Jonas");

        flat.printBalances();
        flat.printHistory();
    }
}
