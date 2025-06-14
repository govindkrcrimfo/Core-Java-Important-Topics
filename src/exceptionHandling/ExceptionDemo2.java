package exceptionHandling;
 class CustomException extends Exception{
  public CustomException(String msg){
     super(msg);
  }
}
public class ExceptionDemo2 {
    public static void main(String[] args) {
    int i=7;
    int j=0;
    try{
        j=5/i;
        if(j==0){
            throw new CustomException(" Custom Exception : I don't want j becomes zero ");
        }
    }
    catch(CustomException e){
        j=1; // here we don't want j=0 , so we assign j=1
     System.out.println("Arithmetic Exception Occured "+ e);
     System.out.println("value of j = "+j);
    }
    catch(Exception e){
        System.out.println("Exception Caught");
    }

    System.out.println("Reached at last line of Code ");
  }

}
