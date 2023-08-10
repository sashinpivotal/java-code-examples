package _12_junit_examples;

import _13_mockito_examples.Address;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // TODO - write testing code of the following method
    public String getUpperCasedPersonInfo() {
        String info = getName() + " is " + age + " years old.";
        return info.toUpperCase();
    }

    // TODO - write testing code of the following method
    public String getLowerCasedPersonInfo() {
        String info = getName() + " is " + age + " years old.";
        return info.toLowerCase();
    }
}


