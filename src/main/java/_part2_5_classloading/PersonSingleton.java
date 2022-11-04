package _part2_5_classloading;

public class PersonSingleton {

    private static final PersonSingleton person;

    static {
        System.out.println("static code block");
        person = new PersonSingleton();
    }

    public static PersonSingleton createPerson() {
        return person;
    }
}

class Main {
    public static void main(String[] args) {
        PersonSingleton person1 = PersonSingleton.createPerson();
        PersonSingleton person2 = PersonSingleton.createPerson();
        boolean b = person1 == person2;
        System.out.println(b);
    }
}
