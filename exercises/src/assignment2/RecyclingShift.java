package assignment2;

public class RecyclingShift extends Shift {
    private int bags;

    public RecyclingShift(int hours, String task, int bags) {
        super(hours, task);
        this.bags = bags;
    }

    @Override
    public int points() {
        return getHours() + bags;
    }

    @Override
    public String ruleName() {
        return "1 per hour and 1 per bag";
    }
}
