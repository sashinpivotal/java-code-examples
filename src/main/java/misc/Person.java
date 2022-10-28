package misc;

public class Person {

    public static final int MINIMUM_AGE = 5;

    int age;

    public void setAge(int age) throws MyMinimumAgeException {
        if (age < MINIMUM_AGE) {
            throw new MyMinimumAgeException("age has to be above " + MINIMUM_AGE);
        }
        this.age = age;
    }
}

class Main {

    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(3);
        } catch (MyMinimumAgeException e) {
            System.out.println("something happened");
        }
    }
}
