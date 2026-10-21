package assignment2;

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
        System.out.println("Task 1. The volunteers");

        FestivalVolunteers v1 = new FestivalVolunteers("Ida", 3, 0);
        FestivalVolunteers v2 = new FestivalVolunteers("Malik", 2, 0);
        FestivalVolunteers v3 = new FestivalVolunteers("Oskar", 0, 0);

        FestivalVolunteers[] all = { v1, v2, v3 };

        for (FestivalVolunteers v : all) {
                System.out.println("  " + v.getName() + " has helped at " + v.getFestivals() + " festivals before");
        }


        // Task 2. Day 1, the bars. Exercise 2.
        // Read Task 2 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 2. Day 1, the bars");

        v1.addShift(new BarShift(8, "Beer bar"));
        v2.addShift(new BarShift(8, "Cocktail bar"));
        v3.addShift(new BarShift(8, "Beer bar"));
        v3.addShift(new BarShift(8, "Coffee bar"));

        // Task 3. Day 2, cup recycling. Exercise 3.
        // Read Task 3 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 3. Day 2, cup recycling");

        v1.addShift(new RecyclingShift(8, "Cup recycling", 2));
        v2.addShift(new RecyclingShift(8, "Cup recycling", 6));
        v3.addShift(new RecyclingShift(8, "Cup recycling", 4));


        // Task 4. Day 3, the team leaders. Exercise 4.
        // FestivalVolunteers does not have this task. Exercise 4 in README.md describes it.
    }

}

//I need to fix points and task 4