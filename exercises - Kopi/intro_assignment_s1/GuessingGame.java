package intro_assignment_s1;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1; // 1 to 10

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        if (guess == secret) {
            System.out.println("Correct! The number was " + secret);
        } else {
            System.out.println("Wrong! The number was " + secret);
        }
    }
}