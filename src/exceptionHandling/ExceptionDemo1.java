package exceptionHandling;
// exception using thorw keyword
public class ExceptionDemo1 {
  public static void main(String[] args) {
    int i=7;
    int j=0;
    try{
        j=5/i;
        if(j==0){
            throw new ArithmeticException("j becomes zero ");
        }
    }
    catch(ArithmeticException e){
        j=1; // here we don't want j=0 , so we assign j=1
     System.out.println("Arithmetic Exception Occured "+ e);
     System.out.println("value of j = "+j);
    }

    System.out.println("Reached at last line of Code ");
  }
}
