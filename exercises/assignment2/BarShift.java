package assignment2;

public class BarShift extends Shift {

    public BarShift(int hours, String task) {
        super(hours, task);
    }

    @Override
    public int points() {
        return getHours();
    }

    @Override
    public String ruleName() {
        return "1 per hour";
    }
}
