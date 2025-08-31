package thread;

class K implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

class L implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

public class Ex4 {
    public static void main(String[] args) {

        K k = new K();
        L l = new L();
        Thread t = new Thread(k);

        Thread t1 = new Thread(l);
        t.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t1.start();

    }

}
