/**
 * Created by bloom on 2018/8/5.
 */
public class AccountingVol implements Runnable {
    static AccountingVol instance = new AccountingVol();
    static volatile int i = 0;

    public synchronized void increase() {
        i++;
    }

    public void run() {
        for (int j = 0; j < 10000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
