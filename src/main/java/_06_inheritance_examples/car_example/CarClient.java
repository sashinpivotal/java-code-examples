package _06_inheritance_examples.car_example;

class CarClient {

    public static void main(String[] args) {
        Car car = new Car("ABC123");
        String vin = car.getVin();
        System.out.println(vin);

        Vehicle xyz234 = new Car("XYZ234");

        DMV dmv = new DMV();
        dmv.register(car);

    }
}