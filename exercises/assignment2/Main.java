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

        System.out.println("  " + v1.getName() + " has helped at " + v1.getFestivals() + " festivals before");
        System.out.println("  " + v2.getName() + " has helped at " + v2.getFestivals() + " festivals before");
        System.out.println("  " + v3.getName() + " has helped at " + v3.getFestivals() + " festivals before");
        System.out.println();

        // Task 2. Day 1, the bars. Exercise 2.
        // Read Task 2 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 2. Day 1, the bars");

        v1.addShift(new BarShift(8, "Beer bar"));
        v2.addShift(new BarShift(8, "Cocktail bar"));
        v3.addShift(new BarShift(8, "Beer bar"));
        v3.addShift(new BarShift(8, "Coffee bar"));

        System.out.print("  Points: " + v1.getName() + " " + v1.getPoints());
        System.out.print(", " + v2.getName() + " " + v2.getPoints());
        System.out.println(", " + v3.getName() + " " + v3.getPoints());
        System.out.println();


        // Task 3. Day 2, cup recycling. Exercise 3.
        // Read Task 3 in FestivalVolunteers.main, then write it here with your objects.
        System.out.println("Task 3. Day 2, cup recycling");

        v1.addShift(new RecyclingShift(8, "Cup recycling", 2));
        v2.addShift(new RecyclingShift(8, "Cup recycling", 6));
        v3.addShift(new RecyclingShift(8, "Cup recycling", 4));

        System.out.print("  Points: " + v1.getName() + " " + v1.getPoints());
        System.out.print(", " + v2.getName() + " " + v2.getPoints());
        System.out.println(", " + v3.getName() + " " + v3.getPoints());
        System.out.println();


        // Task 4. Day 3, the team leaders. Exercise 4.
        // FestivalVolunteers does not have this task. Exercise 4 in README.md describes it.
        System.out.println("Task 4. Day 3, the team leaders");

        v1.addShift(new LeaderShift(8, "Bar team leader", v1.getFestivals()));
        v2.addShift(new LeaderShift(4, "Recycling team leader", v2.getFestivals()));

        System.out.print("  Points: " + v1.getName() + " " + v1.getPoints());
        System.out.print(", " + v2.getName() + " " + v2.getPoints());
        System.out.println(", " + v3.getName() + " " + v3.getPoints());
        System.out.println();
    }
}

