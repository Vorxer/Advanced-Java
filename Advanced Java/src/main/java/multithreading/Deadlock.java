package multithreading;

public class Deadlock {

    //No Deadlock occurs with strings, threads execute sequentially... investigation required
    public static Object throttle = new Object();
    public static Object clutch = new Object();

    public static void main(String[] args) {

        Thread cruiseControl = new Thread(()->{
            synchronized (clutch){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Clutch depressed... waiting for Throttle");
                synchronized (throttle){
                    System.out.println("Throttle increased");
                }
            }
        });

        Thread autoBrake = new Thread(()->{
            synchronized (throttle){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Throttle decreased... waiting for clutch");
                synchronized (clutch){
                    System.out.println("clutch depressed");
                }
            }
        });

        autoBrake.start();
        cruiseControl.start();
    }
}
