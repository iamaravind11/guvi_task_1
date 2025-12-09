package Task5AdvanceJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "bc", "efg", "abcd", "Jkl");

        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .toList();

        System.out.println(STR."Original list: \{strings}");
        System.out.println(STR."Non-empty strings: \{nonEmptyStrings}");
    }
}
