package differentLoops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEach {
    public static void main(String args[]) {
        // for Each we can use only on collections
        // collections :- List , Map , Linkedlist, Set , tree etc

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);
        m.put("b", 2);
        m.put("d", 4);
        m.put("c", 3);

        LinkedList<Integer> ld = new LinkedList<>();
        ld.add(1);
        ld.add(2);
        ld.add(3);
        ld.add(4);

        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(3);
        st.add(8);
        st.add(1);
        st.add(4);
        st.add(2);

        // using for ( this can used to iterate over collections as
        // we as arrays)

        System.out.println("list data ");
        for (Integer i : l) {
            System.out.println(i);
        }
        System.out.println("Map data");
        for (Entry<String, Integer> k : m.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }
        System.out.println("LInked list data");
        for (Integer i : ld) {
            System.out.println(i);
        }

        System.out.println("Set data");
        for (int i : st) {
            System.out.println(i);
        }

        // using forEach ( only to iterate on collections)

        System.out.println("List data");
        l.forEach(i -> System.out.println(i));
        System.out.println("map data");
        m.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("Linkedlist data");
        ld.forEach(i -> System.out.println(i));
        System.out.println("set data");
        st.forEach(i -> System.out.println(i));
    }
}
