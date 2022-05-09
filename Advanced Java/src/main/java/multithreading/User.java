package multithreading;

public class User implements Runnable{

    public String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        SynchronizedDemo.withdraw(400);
    }

    @Override
    public String toString() {
        return name;
    }
}
