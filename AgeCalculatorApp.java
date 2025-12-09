package Task5AdvanceJava;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthDateInput = scanner.nextLine();

        // Parse birthdate using LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);
        LocalDate today = LocalDate.now();

        // Calculate age using Period
        Period age = Period.between(birthDate, today);

        // Display age in years, months, days
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());

        scanner.close();
    }
}
