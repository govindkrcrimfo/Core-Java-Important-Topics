package streamApi;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class Ex1 {
    public static void main(String[] args) {
        String s = "Mamaya is malayalam"; // find the frequency of each character
        IntStream ist = s.chars(); // String to InputStream
        Map<Character, Long> m = ist.map(Character::toLowerCase) // to lower case (if we want to ignore case
                                                                 // sensitivity)
                .mapToObj(c -> (char) c) // to Character object
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // counting the frequency

        m.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        System.out.println();
        // frequency of character array
        System.out.println("Frequency of Character Array");
        char[] ch = { 'p', 'a', 'p', 'y', 'a', 'b', 'a', 'n', 'a', 'n', 'a' };
        Character[] characterArr = new String(ch).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        // Apply stream API on the Character[] to count frequencies
        Map<Character, Long> characterCounts = Arrays.stream(characterArr)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        // Print the frequency of each character
        characterCounts.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
