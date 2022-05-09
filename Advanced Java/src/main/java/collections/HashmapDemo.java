package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

    public static void main(String[] args) {
        Map<String, String> fleetCarriers = new HashMap<>();
        fleetCarriers.put("CV1","Langley");
        fleetCarriers.put("CV2","Lexington");
        fleetCarriers.put("CV3","Saratoga");
        fleetCarriers.put("CV5","Yorktown");
        fleetCarriers.put("CV6","Enterprise");
        //output unordered
        System.out.println(fleetCarriers.toString());

        //original CV5 removec
        fleetCarriers.put("CV5","YKTN");

        fleetCarriers.put(null,"RNGR");
        System.out.println(fleetCarriers.toString());

        fleetCarriers.remove("CV1");
        System.out.println(fleetCarriers.toString());

        fleetCarriers.clear();
        System.out.println(fleetCarriers.toString());
    }

}
