package Task5AdvanceJava;

import java.util.List;
import java.util.stream.Stream;

public class UppercaseConverter {
    public static void main(String[] args) {
        List<String> names = Stream.of("aBc", "d", "ef").toList();

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Original: " + names);
        System.out.println("Uppercase: " + uppercaseNames);
    }
}
