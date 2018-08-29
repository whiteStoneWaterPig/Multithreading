/**
 * Created by bloom on 2018/8/5.
 */
public class DaemonDemo {
    public static class DeamonT extends Thread{
        public void run(){
            while(true){
                System.out.println("I am alive!");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new DeamonT();
        t.setDaemon(true);
        t.start();

        Thread.sleep(2000);
    }



}
