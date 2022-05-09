package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        List nonGenericList = new ArrayList();
        nonGenericList.add("BMW");
        String make = (String)nonGenericList.get(0);
        System.out.println("Non Generic Element {}" + make);
        nonGenericList.add(810.2);

        List<String> genericList = new ArrayList();
        genericList.add("Mercedes");
        make = genericList.get(0);
        System.out.println("Generic Element {}" + make);

    }
}
