package assignment1;

// Expense is one payment.

public class Expense {
    // The history, one position per expense, in the order they were paid.
    char type;
    Flatmate payer;     // the position of the payer in names
    int amount;    // kroner
    String description;
    Flatmate forWhom;

    public Expense(char type, Flatmate payer, int amount, String description, Flatmate forWhom){
        this.type = type;
        this.payer = payer;     // the position of the payer in names
        this.amount = amount;    // kroner
        this.description = description;
        this.forWhom = forWhom;
    }

    /** How an expense of this type is split, for the printed lines. */
    public String typeName() {
        switch (type) {
            case 'E':
                return "split equally";
            case 'P':
                return "for one flatmate";
            default:
                return "?";
        }
    }
    String line() {
        return payer.name + " paid " + amount + " kr: " + description + " (" + typeName() + ")";
    }
}
