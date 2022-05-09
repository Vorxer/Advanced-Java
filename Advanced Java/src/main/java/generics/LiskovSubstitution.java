package generics;

import misc.Car;
import misc.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Car car = new Car();

        accelerateVehicle(car);

        List<Car> cars= new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());

        //Incompatible type error
        //accelerateVehicle(cars);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Car());

        accelerateVehicles(vehicles);
    }

    public static void accelerateVehicle(Vehicle vehicle){
        vehicle.accelerate();
    }

    public static void accelerateVehicles(List<Vehicle> vehicleList){
        for (Vehicle v: vehicleList) {
            v.accelerate();
        }
    }
}
