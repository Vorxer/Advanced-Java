package multithreading;

public class SynchronisedUser extends User{
    public SynchronisedUser(String name) {
        super(name);
    }

    @Override
    public void run() {
        SynchronizedDemo.synchronizedWithdraw(400);
    }
}
