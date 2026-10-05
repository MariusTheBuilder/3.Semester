package intro_assignment_s1;

import java.util.Scanner;

public class MillisConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter duration in milliseconds: ");
        long millis = scanner.nextLong();

        long seconds = (millis / 1000) % 60;
        long minutes = (millis / (1000 * 60)) % 60;
        long hours   = (millis / (1000 * 60 * 60)) % 24;
        long days    = millis / (1000 * 60 * 60 * 24);

        System.out.println(days + " days, " + hours + " hours, " +
                minutes + " minutes, " + seconds + " seconds");
    }
}