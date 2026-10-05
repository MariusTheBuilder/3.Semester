package intro_assignment_s1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert (F)ahrenheit to Celsius or (C)elsius to Fahrenheit? ");
        char choice = Character.toUpperCase(scanner.next().charAt(0));

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 'F') {
            double celsius = (temp - 32) * 5.0 / 9.0;
            System.out.println(temp + "F = " + celsius + "C");
        } else if (choice == 'C') {
            double fahrenheit = temp * 9.0 / 5.0 + 32;
            System.out.println(temp + "C = " + fahrenheit + "F");
        } else {
            System.out.println("Invalid choice");
        }
    }
}