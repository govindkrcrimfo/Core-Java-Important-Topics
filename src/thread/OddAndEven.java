package thread;
class  OddEven{
    static  int st=0;
    final  static  int limit=10;
    synchronized  void printOdd() throws InterruptedException {
        while (st<=limit){
            if(st%2==0){
                wait();
            }else {
                System.out.println(" odd - "+st);
                st++;
                notify();
            }
        }
    }
    synchronized  void printEven() throws InterruptedException {
        while (st<=limit){
            if(st%2!=0){
                wait();
            }else {
                System.out.println(" Even - "+st);
                st++;
                notify();
            }
        }
    }
}
public class OddAndEven {
    public static void main(String args[]){
        OddEven oddEven=new OddEven();
        Thread thread1=new Thread(()->{
            try {
                oddEven.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2=new Thread(()->{
            try {
                oddEven.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread2.start();
    }
}
