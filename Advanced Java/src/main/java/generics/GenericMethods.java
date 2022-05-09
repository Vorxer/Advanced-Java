package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Character[] characters = {'a','b','c'};
        Integer[] integers = {1,2,3};
        Boolean[] booleans = {true, false, true};

        //All return List<Object>
        List<Object> charObjList = listify(characters, new ArrayList<>());
        List<Object> intObjList = listify(integers, new ArrayList<>());
        List<Object> boolObjList = listify(booleans, new ArrayList<>());

        //Return List<Character>
        List<Character> charList = genericListify(characters, new ArrayList<>());
        //Return List<Character>
        List<Integer> intList = genericListify(integers, new ArrayList<>());
        //Return List<Character>
        List<Boolean> boolList = genericListify(booleans, new ArrayList<>());


    }

    public static List<Object> listify(Object[] arr, List<Object> list){
        for(Object element: arr){
            list.add(element);
        }
        return list;
    }

    public static <G> List<G> genericListify(G[] arr, List<G> list){
        for(G element: arr){
            list.add(element);
        }
        return list;
    }

}
