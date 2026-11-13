package assignment1;

// Flatmate is one person who lives in the flat.

public class Flatmate {
    String name;
    int roomSize;     // square meters
    int balance;      // kroner

    Flatmate(String name, int roomSize) {
        this.name = name;
        this.roomSize = roomSize;
        this.balance = 0;
    }
}