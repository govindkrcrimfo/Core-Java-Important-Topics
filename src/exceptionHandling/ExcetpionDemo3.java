package exceptionHandling;

class Example {
    public int divide(int a, int b) throws ArithmeticException {
        int k = a / b;
        return k;
    }

}

public class ExcetpionDemo3 {
    public static void main(String args[]) {
        System.out.println("Main statrt");
        Example ex = new Example();
        int j = 1000; // intialise value becoz when exception occurs it will print this value
        try {
            j = ex.divide(15, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught " + e);
        }
        System.out.println("results = " + j);
    }
}
