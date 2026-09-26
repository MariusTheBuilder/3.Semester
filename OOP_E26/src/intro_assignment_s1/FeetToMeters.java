package intro_assignment_s1;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.3048;
        System.out.println(feet + " feet = " + meters + " meters");
    }
}