package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Empolyee {
    String name;
    int age;

    public Empolyee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empolyee [name=" + name + ", age=" + age + "]";
    }

}

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
        // seperate the employees whose age is more than 35 and less than 35
        List<Empolyee> el = Arrays.asList(new Empolyee("Govind", 24), new Empolyee("Doll", 23), new Empolyee("a", 49),
                new Empolyee("Ram", 35), new Empolyee("c", 38), new Empolyee("Shayam", 19), new Empolyee("def", 99));
        Map<Boolean, List<Empolyee>> elMp = el.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 35));
        List<Empolyee> age1 = elMp.get(true);
        List<Empolyee> age2 = elMp.get(false);
        System.out.println("Employee whose age is greater than 35 : ");
        System.out.println(age1);
        System.out.println();
        System.out.println("Employee whose age is less than 35 : ");
        System.out.println(age2);
    }

}
