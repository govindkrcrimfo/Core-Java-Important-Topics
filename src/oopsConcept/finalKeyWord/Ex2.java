package oopsConcept.finalKeyWord;

class Test1 {
    final static void msg() {
        System.out.println("hello msg");
    }

    final int sum(int a, int b) {
        return a + b;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.sum(1, 2));
        Test1.msg();
    }

}
