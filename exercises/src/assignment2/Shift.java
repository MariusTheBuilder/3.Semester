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

    //Both are used as @override's in the different types of shifts
    public abstract int points();
    public abstract String ruleName();
}