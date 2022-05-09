package multithreading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedDemo {

    private static int reserve = 1000;

    private static int synchronisedReserve = 1000;

    public static void main(String[] args) throws Exception{

        List<User> users = new ArrayList<>();
        initList(users);

        users.forEach(SynchronizedDemo::runUser);
        Thread.sleep(200);
        System.out.println("Reserve = " + reserve);

        List<SynchronisedUser> synchronisedUsers = new ArrayList<>();
        initSynchroList(synchronisedUsers);

        synchronisedUsers.forEach(SynchronizedDemo::runUser);
        Thread.sleep(200);
        System.out.println("Synchronised Reserve = " + synchronisedReserve);

    }

    public static void withdraw(int amount) {
        if(reserve - amount >= 0) {
            try {
                //wait time to simulate heavy transaction
                Thread.sleep(5);
                reserve = reserve - amount;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else
            System.out.println("amount exceeds current reserve: Thread " + Thread.currentThread().getName());
    }

    public synchronized static void synchronizedWithdraw(int amount){
        if(synchronisedReserve - amount >= 0)
            try {
                //wait time to simulate heavy transaction
                Thread.sleep(5);
                synchronisedReserve = synchronisedReserve - amount;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        else
            System.out.println("amount exceeds current reserve: Thread " + Thread.currentThread().getName());
    }

    public static int getReserve() {
        return reserve;
    }

    public static int getSynchronisedReserve() {
        return synchronisedReserve;
    }

    public static void initList(List<User> users){
        users.add(new User("Fubuki"));
        users.add(new User("Isonami"));
        users.add(new User("Murakumono"));
        users.add(new User("Hatsuyuki"));
        users.add(new User("Miyuki"));
        users.add(new User("Shiranui"));
    }

    public static void initSynchroList(List<SynchronisedUser> users){
        users.add(new SynchronisedUser("Fubuki"));
        users.add(new SynchronisedUser("Isonami"));
        users.add(new SynchronisedUser("Murakumono"));
        users.add(new SynchronisedUser("Hatsuyuki"));
        users.add(new SynchronisedUser("Miyuki"));
        users.add(new SynchronisedUser("Shiranui"));
    }

    public static void runUser(User user){
        Thread t = new Thread(user);
        t.setName(user.name);
        t.start();
    }
}
