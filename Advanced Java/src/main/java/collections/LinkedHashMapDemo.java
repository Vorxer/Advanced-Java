package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        //LinkedHashMao Initial Capacity = 4, Load capacity = 75% (3 entries) Ordering mode = true -> access order (last access on the bottom)
        //false = insetion order
        Map<String,String> linkedHashMap = new LinkedHashMap(4,0.75f, true);
        linkedHashMap.put("CV1","Langley");
        linkedHashMap.put("CV2","Lexington");
        linkedHashMap.put("CV3","Saratoga");
        linkedHashMap.put("CV5","Yorktown");
        linkedHashMap.put("CV6","Enterprise");

        printMap(linkedHashMap);

        System.out.println(linkedHashMap.get("CV3"));

        printMap(linkedHashMap);

    }

    static void  printMap(Map<?,?> m){
        for(Map.Entry<?,?> e : m.entrySet()){
            System.out.println(e.getKey().toString() + " " + e.getValue().toString());
        }
    }
}
