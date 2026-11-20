package assignment3;

import java.util.ArrayList;

/**
 * Assignment 2, your program. Write it with objects.
 *
 * Main.main does the tasks of FestivalVolunteers.main again, in the same
 * order, with objects of the classes you write. Write each class in its own
 * file in this folder. Main.main tells the story, and your objects do the
 * work.
 */
public class Main {
        public static void main(String[] args) {
        // Task 1. The volunteers. Exercise 1.
        // Read Task 1 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println();
        System.out.println("Task 1. The volunteers");
        ArrayList<FestivalVolunteers> volunteers = new ArrayList<FestivalVolunteers>();

        volunteers.add(new FestivalVolunteers("Ida", 3, 0));
        volunteers.add(new FestivalVolunteers("Malik", 2, 0));
        volunteers.add(new FestivalVolunteers("Oskar", 0, 0));

        for (FestivalVolunteers v : volunteers) {
                v.printHistory();
        }
        System.out.println();


        // Task 2. Day 1, the bars. Exercise 2.
        // Read Task 2 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 2. Day 1, the bars");

        volunteers.get(0).addShift(new BarShift(8, "Beer bar"));
        volunteers.get(1).addShift(new BarShift(8, "Cocktail bar"));
        volunteers.get(2).addShift(new BarShift(8, "Beer bar"));
        volunteers.get(2).addShift(new BarShift(8, "Coffee bar"));

        System.out.print("  Points: ");
        for (FestivalVolunteers v : volunteers) {
                System.out.print(v);
        }
        System.out.println();
        System.out.println();


                // Task 3. Day 2, cup recycling. Exercise 3.
        // Read Task 3 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 3. Day 2, cup recycling");

        volunteers.get(0).addShift(new RecyclingShift(8, "Cup recycling", 2));
        volunteers.get(1).addShift(new RecyclingShift(8, "Cup recycling", 6));
        volunteers.get(2).addShift(new RecyclingShift(8, "Cup recycling", 4));

        // Exception 1
        try {
                volunteers.get(2).addShift(new RecyclingShift(14, "Cup recycling", 4));
        } catch (IllegalArgumentException e){
                System.out.println("       Rejected: " + e.getMessage());
        }


                System.out.print("  Points: ");
        for (FestivalVolunteers v : volunteers) {
                System.out.print(v);
        }
        System.out.println();
        System.out.println();


        // Task 4. Day 3, the team leaders. Exercise 4.
        // FestivalVolunteers does not have this task. Exercise 4 in README.md describes it.
        System.out.println("Task 4. Day 3, the team leaders");

        volunteers.get(0).addShift(new LeaderShift(8, "Bar team leader", volunteers.get(0).getFestivals()));
        volunteers.get(1).addShift(new LeaderShift(4, "Recycling team leader", volunteers.get(1).getFestivals()));

        System.out.print("  Points: ");
        for (FestivalVolunteers v : volunteers) {
                System.out.print(v);
        }
        System.out.println();
    }
}