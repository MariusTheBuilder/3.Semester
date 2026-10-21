package assignment2;

public abstract class Shift {
    private int hours;
    private String task;

    public Shift(int hours, String task) {
        this.hours = hours;
        this.task = task;
    }

    public int getHours() {
        return hours;
    }

    public String getTask() {
        return task;
    }

    // No body: every subclass must supply its own version
    public abstract int points();
    public abstract String ruleName();
}