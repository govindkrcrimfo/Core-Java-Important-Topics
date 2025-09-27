package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class Ex3 {

    public static void main(String[] args) {
        // paritionBy Collectors
        // Seperate odd and even number from a list
        List<Integer> l = Arrays.asList(1, 4, 7, 6, 6, 11, 98, 32, 43, 21, 78, 99, 100, 551);
        Map<Boolean, List<Integer>> m = l.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.print("Even numbers are : ");
        System.out.print(m.get(true));
        System.out.println();
        System.out.print("Even numbers are : ");
        System.out.println(m.get(false));

        // 2nd method
        System.out.println("2nd method to print even odd number ");

        for (Map.Entry<Boolean, List<Integer>> k : m.entrySet()) {
            if (k.getKey()) {
                System.out.print("evne number  ");
                System.out.println(k.getValue());
            } else {
                System.out.print("odd number ");
                System.out.println(k.getValue());
            }
        }
    }

}
