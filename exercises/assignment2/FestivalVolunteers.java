package assignment2;

/**
 * Assignment 2, the program you start from. Leave this file as it is.
 *
 * The volunteers of a music festival, with no objects. Volunteer number i
 * has the name names[i], has helped at festivals[i] festivals before this
 * one, and has earned points[i] points at this one. Only positions 0 to
 * count - 1 are in use. A volunteer with 30 points or more gets their
 * festival ticket for free.
 *
 * Each type of shift has a letter.
 *   'B'  a bar shift, 1 point per hour
 *   'R'  a recycling shift, 1 point per hour and 1 per bag of cups collected
 *
 * main does three tasks, and each one prints its result. Each task starts
 * with a comment, Task 1, Task 2 and Task 3, that names the methods it uses.
 */
public class FestivalVolunteers {
    // The volunteers, one position per person. 10 is enough for this festival.
    private String name;
    public int festivals;   // festivals before this one
    private int points;

    public FestivalVolunteers(String name, int festivals, int points) {
        this.name = name;
        this.festivals = festivals;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getFestivals() {
        return festivals;
    }

    public void addShift(Shift shift) {
        points += shift.points();
        System.out.println("  " + name + " worked " + shift.getHours()
                + " h, " + shift.getTask() + ": " + shift.points()
                + " points (" + shift.ruleName() + ")");
    }
}
