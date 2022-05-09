package multithreading;

public class ThreadRunner {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());

        ExtThreads thread1 = new ExtThreads();
        //thread is now in waiting state
        thread1.start();
        //thread is now alive
        System.out.println(thread1.isAlive());
        System.out.println(Thread.activeCount());

        ExtThreads thread2 = new ExtThreads();
        thread2.start();
        thread2.setName("Isuzu");
        thread1.setName("Nagara");

        Thread thread3 = new Thread(new ImplementsRunnable());
        thread3.start();
        thread3.setName("Sendai");

        Thread thread4 = new Thread(() -> {
                for (int i = 0; i < 100; i++)
                    System.out.println(Thread.currentThread().getName() + ": " + i);
        });

        thread4.setName("Jintsuu");
        thread4.start();
    }


}
