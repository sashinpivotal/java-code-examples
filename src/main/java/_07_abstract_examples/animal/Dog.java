package _07_abstract_examples.animal;

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Dog");
    }

}
