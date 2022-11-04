package _part2_5_classloading;

public class Person {

    private static final Person person;

    static {
        System.out.println("static code block");
        person = new Person();
    }

    public static Person createPerson() {
        return person;
    }
}

class Main {
    public static void main(String[] args) {
        Person person1 = Person.createPerson();
        Person person2 = Person.createPerson();
        boolean b = person1 == person2;
        System.out.println(b);
    }
}
