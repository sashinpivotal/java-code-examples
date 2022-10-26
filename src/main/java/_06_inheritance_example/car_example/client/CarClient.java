package _06_inheritance_example.car_example.client;

import _06_inheritance_example.car_example.Boat;
import _06_inheritance_example.car_example.Car;
import _06_inheritance_example.car_example.DMV;
import _06_inheritance_example.car_example.Vehicle;

class CarClient {

    public static void main(String[] args) {
        Car car = new Car("ABC123");
        String vin = car.getVin();
        System.out.println(vin);

        Vehicle boat = new Boat("BNW234");
        DMV dmv = new DMV();
        dmv.register(boat);

        Vehicle vehicle = new Car("XYZ234");
        vehicle.moveTo("boston");
    }
}