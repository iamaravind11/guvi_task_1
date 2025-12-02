package ExceptionAndCollections;

import java.util.Scanner;

public class WeekdayPrinter {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day position (0-6): ");
        int dayIndex = scanner.nextInt();

        try {
            // Try to print the weekday at the given index
            System.out.println("Day at position " + dayIndex + " is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid day position between 0 and 6.");
        }

        scanner.close();
    }
}
