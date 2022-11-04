package _part2_5_classloading;

public class Person {
}

class Main10 {
    public static void main(String[] args) {
        Person person = new Person();
        String className = Person.class.getName();
        System.out.println(className);
    }
}