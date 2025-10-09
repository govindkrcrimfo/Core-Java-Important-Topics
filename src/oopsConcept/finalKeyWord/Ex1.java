package oopsConcept.finalKeyWord;

interface car {
    public void cardetails();
}

abstract class cycle {
    abstract void bycledetails();

}

final class Test extends cycle implements car {

    public void greet() {
        System.out.println("hello from greet method");
    }

    @Override
    public void cardetails() {
        System.out.println("Car details");
    }

    @Override
    void bycledetails() {
        System.out.println("Bycycle details ");
    }

}

class Ex1 {
    public static void main(String[] args) {
        System.out.println("Final keyword ");
        Test t = new Test();
        t.greet();
        t.bycledetails();
        t.cardetails();
        System.out.println();

    }
}
