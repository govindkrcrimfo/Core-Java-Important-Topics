package streamApi;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.function.Function;

public class Ex1 {
    public static void main(String[] args) {
        String s = "Banan And Papaya"; // find the frequency of each character
        IntStream ist = s.chars(); // String to InputStream
        Map<Character, Long> m = ist.map(Character::toLowerCase) // to lower case (if we want to ignore case
                                                                 // sensitivity)
                .mapToObj(c -> (char) c) // to Character object
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // counting the frequency

        m.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

    }
}
