package functional;

import misc.Airliner;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Airliner> airfleet = populateAirfleet();

        System.out.println("EXTERNAL ITERATION:");
        for(Airliner a: airfleet){
            if(a.getModel().startsWith("A"))
                if(a.getOperator().startsWith("B"))
                    System.out.println(a.toString());

        }

        System.out.println("INTERNAL ITERATION");
        //filter() -> lazy method
        //foreas
        airfleet.stream().filter(a->a.getModel().startsWith("A")).filter(a->a.getOperator().startsWith("B")).forEach(System.out::println);

        //using parallel streams
        airfleet.parallelStream().filter(a->a.getModel().startsWith("A")).filter(a->a.getOperator().startsWith("B")).forEach(System.out::println);

    }

    public static List<Airliner> populateAirfleet(){
        List<Airliner> airliners = new ArrayList<>();
        airliners.add(new Airliner("A320-200", "FlyDubai"));
        airliners.add(new Airliner("A340-200", "Sri Lankan"));
        airliners.add(new Airliner("B777-300ER", "Emirates"));
        airliners.add(new Airliner("B747-100", "Pan American"));
        airliners.add(new Airliner("A320-NEO", "British Airways"));
        airliners.add(new Airliner("B787-400", "British Airways"));
        airliners.add(new Airliner("A350","British Airways"));
        airliners.add(new Airliner("B747-200", "Pan American"));
        airliners.add(new Airliner("A380", "Emirates"));
        airliners.add(new Airliner("A380", "Singapore"));
        airliners.add(new Airliner("B777-100", "Brussels Airways"));
        airliners.add(new Airliner("A350-400ER", "Brussels Airways"));
        airliners.add(new Airliner("B787","Luftwaffe"));
        airliners.add(new Airliner("B777-300ER", "USAF"));
        return airliners;
    }
}
