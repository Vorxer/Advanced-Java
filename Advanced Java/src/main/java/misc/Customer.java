package misc;

public class Customer {

    public boolean hasBeenServed;

    public String name;

    public Customer(String name){
        hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }

    @Override
    public String toString() {
        return name;
    }
}
