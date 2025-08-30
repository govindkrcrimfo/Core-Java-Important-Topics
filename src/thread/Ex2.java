package thread;

// multiple thread 
// set priority 
// sleep  thread
class C extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
                e.printStackTrace();
            }
        }
    }
}

class D extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
                e.printStackTrace();
            }
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        // a.setPriority(Thread.MAX_PRIORITY);
        // System.out.println("priority " + a.getPriority());
        c.start();
        d.start();
    }

}
