package _06_inheritance_examples.car_example;

class CarClient {

    public static void main(String[] args) {
//        Car car = new Car("ABC123");
//        String vin = car.getVin();
//        System.out.println(vin);
//
//        Vehicle boat = new Boat("BNW234");
//        DMV dmv = new DMV();
//        dmv.register(boat);

        Vehicle vehicle = new Car("XYZ234");
        Vehicle vehicle2 = new Vehicle("adf");
        String classNameOfVehicle = vehicle.getClass().getName();
        String classNameOfVehicle2 = vehicle2.getClass().getName();
        System.out.println("class of the object vehicle is pointing at = " + classNameOfVehicle);
        System.out.println("class of the object vehicle is pointing at = " + classNameOfVehicle2);
        if (classNameOfVehicle.contains("Vehicle")) {
           vehicle.moveTo("boston");
        }
        vehicle.moveTo("whatever");

    }
}