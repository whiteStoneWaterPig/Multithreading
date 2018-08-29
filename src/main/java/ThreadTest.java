/**
 * Created by bloom on 2018/8/5.
 */
public class ThreadTest implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadTest());
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }


    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrypted!");
                break;
            }
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("Interrupted When sleep");
                //设置中断状态
                Thread.currentThread().interrupt();
            }
            Thread.yield();
        }
    }
}
