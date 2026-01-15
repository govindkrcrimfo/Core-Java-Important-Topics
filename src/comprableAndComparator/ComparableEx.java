package comprableAndComparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*
Used to define natural ordering of an object
Inside the same class
 implements Comparable<Employee>
Method: compareTo()
 */



class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // based on firstName (String
    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }


  // based on age
//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
}
public class ComparableEx {
    public  static  void main(String goving[]){
        List<Student> ls=new ArrayList<>(List.of(new Student("Govind","kumar",25),
                new Student("zaju","roy",32),
                new Student("monu","mane",18),
                new Student("shayam","sundar",25)
                ));
        Collections.sort(ls);
        ls.forEach(s->{
            System.out.println(s.firstName);
        });


    }
}
