package collections;

import misc.Customer;

import java.util.LinkedList;

public class LinkedListQueue {

    public static void main(String[] args) {
        LinkedList<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Mikkel"));
        customers.add(new Customer("Jonas"));
        customers.add(new Customer("Marta"));
        customers.add(new Customer("Ulrich"));
        customers.add(new Customer("Katrina"));
        System.out.println(customers);
        serveCustomer(customers);
        System.out.println(customers);
        serveCustomer(customers);
        System.out.println(customers);
        serveCustomer(customers);
        System.out.println(customers);
    }

    static void serveCustomer(LinkedList<Customer> queue){

        Customer customer = queue.poll();
        customer.serve();

    }
}
