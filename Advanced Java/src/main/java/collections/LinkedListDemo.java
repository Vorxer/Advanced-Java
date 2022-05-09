package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1,"C");
        linkedList.add("B");
        System.out.println(linkedList.toString());
        linkedList.remove("B");
        System.out.println(linkedList.toString());

    }
}
