package _07_abstract_examples.animal;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // abstract methods
    public abstract void breathe();
}

