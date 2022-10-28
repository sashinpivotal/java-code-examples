package _10_exception_examples;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, MyOwnCheckedException {
        Employee employee = new Employee("Jaon");
        employee.goToWork();
        System.out.println("Done");
    }

}

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void goToWork() throws MyOwnCheckedException {
        Car c = new Car("ABC123");
        try {
            c.moveTo("Moon");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            throw new TrafficIsHeavyException("my business level exception message");
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } catch (Exception e) {
            System.out.println("general exception catch");
        }
        System.out.println("Arrived at work");
    }
}

class Car {

    private String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public void moveTo(String location) throws SQLException, MyOwnCheckedException {
        if (location.equals("Mars")) {
            throw new IllegalArgumentException(
                    "Can't get to " + location
            );
        } else if (location.equals("Moon")) {
            throw new SQLException("Can't get to " + location);
        } else if (location.equals("Sun")) {
            throw new MyOwnCheckedException();
        } else {
            System.out.println("yes, you can go that " + location);
        }
    }
}
