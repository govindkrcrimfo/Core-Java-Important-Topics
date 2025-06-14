package exceptionHandling;

public class ExceptionDemo {
    public static void main(String [] args) {
        int i=0;
        int arr[]={1,2,3,4,5};
        try{
        int j=10/i;
        int m=arr[5];
        }
        catch(ArithmeticException e){ 
            System.out.println("intger cannot be divide by Zero "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Trying to access array out of its range "+e);
        }
        catch(Exception e){ // if above catch block is not executed then this will be executed
           System.out.println(" Exception caught");
        }

        System.out.println("Reached at last line of Code ");
    }
     
}
