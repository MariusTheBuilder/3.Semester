package assignment1;

// Flat keeps the flatmates and the history of expenses, in arrays.
// Arrays for 6 flatmates and 20 expenses, as in FlatShare, are big enough.

public class Flat {
    Flatmate[] flatmates = new Flatmate[6];
    int flatmateCount = 0;

    Expense[] expenses = new Expense[20];
    int expenseCount = 0;

    /** A new flatmate moves in, with a balance of 0. */
    Flatmate moveIn(String name, int roomSize) {
        Flatmate flatmate = new Flatmate(name, roomSize);
        flatmates[flatmateCount] = flatmate;
        flatmateCount++;
        System.out.println(name + " moves in (" + roomSize + " m2)");
        return flatmate;
    }

    /**
     * A flatmate moves out. The last flatmate in the arrays moves into the
     * position that is left free, so that there are no gaps.
     */
    void moveOut(String name) {
        int position = findFlatmate(name);
        int last = flatmateCount - 1;
        flatmates[position] = flatmates[last];
        flatmateCount--;
        System.out.println(name + " moves out");
    }

    /** The position of the flatmate with this name, or -1 if there is none. */
    int findFlatmate(String name) {
        for (int i = 0; i < flatmateCount; i++) {
            if (flatmates[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /** The flatmate with this name, or null if there is none. */
    Flatmate flatmateNamed(String name) {
        int position = findFlatmate(name);
        return position == -1 ? null : flatmates[position];
    }

    /**
     * A flatmate paid for something. The expense goes into the history, and
     * then the balances change. The balance of the payer goes up by the whole
     * amount, and the balance of everyone who shares the expense goes down by
     * their part. How the parts are worked out depends on the type of expense.
     * forWhom is only used by the type 'P', and the other types pass null.
     */
    void addExpense(char type, String payerName, int amount, String description, String forWhomName) {
        Flatmate payer = flatmateNamed(payerName);
        Flatmate forWhom = forWhomName == null ? null : flatmateNamed(forWhomName);

        Expense expense = new Expense(type, payer, amount, description, forWhom);
        expenses[expenseCount] = expense;
        expenseCount++;
        System.out.println(expense.line());

        switch (type) {
            case 'E':
                splitEqually(payer, amount);
                break;
            case 'P':
                chargeOneFlatmate(payer, forWhom, amount);
                break;
            default:
                // A type of expense nobody has taught this program to split.
                // The rent, 'R', ends up here. See README.md.
                break;
        }
    }

    /** Everybody in the flat pays the same part, the payer included. */
    void splitEqually(Flatmate payer, int amount) {
        payer.balance = payer.balance + amount;
        int part = amount / flatmateCount;
        for (int i = 0; i < flatmateCount; i++) {
             flatmates[i].balance = flatmates[i].balance - part;
        }
    }

    /** One flatmate owes the whole amount to the payer. */
    void chargeOneFlatmate(Flatmate payer, Flatmate flatmate, int amount) {
        payer.balance = payer.balance + amount;
        flatmate.balance = flatmate.balance - amount;
    }

    /** The balance of every flatmate, and the total. */
    void printBalances() {
        System.out.println();
        System.out.println("Balances (+ the others owe you money, - you owe the others)");
        int total = 0;
        for (int i = 0; i < flatmateCount; i++) {
            System.out.println("  " + flatmates[i].name + ": " + flatmates[i].balance + " kr");
            total = total + flatmates[i].balance;
        }
        System.out.println("  Total: " + total + " kr (always 0 when the accounts are right)");
    }

    /** Every expense of the month, in the order they were paid. */
    void printHistory() {
        System.out.println();
        System.out.println("History");
        for (int i = 0; i < expenseCount; i++) {
            System.out.println("  " + expenses[i].line());
        }
    }
}



