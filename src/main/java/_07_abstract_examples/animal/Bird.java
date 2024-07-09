package _07_abstract_examples.animal;

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " breathe by Bird");
    }
}
