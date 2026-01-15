package comprableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Used to define custom
sorting based on mulitiple fields
Separate class or lambda
Method: compare()
 */
class Student1  {
    String firstName;
    String lastName;
    int age;

    public Student1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
public class ComparatorEx {
     public static  void main(String args[]){
         List<Student1> ls=new ArrayList<>(List.of(new Student1("Govind","kumar",25),
                 new Student1("zaju","roy",32),
                 new Student1("monu","mane",18),
                 new Student1("shayam","sundar",25)
         ));

         // sorting usign comparator ( based on mulitple fields )
         Collections.sort(ls, Comparator.comparing((Student1 e)->e.getFirstName())
                 .thenComparing((Student1 e)->e.getAge()).
                 thenComparing((Student1 e)->e.getLastName()));


         ls.forEach((e)->{
             System.out.println(e.firstName+"  "+e.getLastName()+"  "+e.getAge());
         });
     }

}
