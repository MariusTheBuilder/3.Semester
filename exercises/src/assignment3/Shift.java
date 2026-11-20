package assignment3;

public abstract class Shift {
    private int hours;
    private String task;

    public Shift(int hours, String task) {
        if (hours < 0 || hours > 13) {
            throw new IllegalArgumentException("13 hours straight is the legal limit, got " + hours);
        }
        this.hours = hours;
        this.task = task;
    }

    public int getHours() {
        return hours;
    }

    public String getTask() {
        return task;
    }

    //Both are used as @override's in the different types of shifts
    public abstract int points();
    public abstract String ruleName();
}