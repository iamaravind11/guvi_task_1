package Task5AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGiftProgram {
    public static void main(String[] args) {
        // List of 10 students
        List<String> students = Arrays.asList(
                "Alice", "Bob", "Aarav", "Charlie", "Amy",
                "David", "Anita", "Eve", "Arjun", "Frank"
        );

        System.out.println(STR."All Students: \{students}");

        // Filter students whose names start with "A" using lambda and Stream API
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(STR."Special Gift Students (starts with A): \{specialGiftStudents}");
    }
}