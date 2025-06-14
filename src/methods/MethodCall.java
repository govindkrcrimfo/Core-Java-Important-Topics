package methods;
 
class Student{
  public  void display(){
    System.out.println("Student class");
  }
}
public class MethodCall {

   public static void main(String arg[]){
    System.out.println("hello methods");
    Student s=new Student();
    s.display();
   }

}
