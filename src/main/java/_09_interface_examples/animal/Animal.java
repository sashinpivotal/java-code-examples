package _09_interface_examples.animal;

public class Animal implements Breathable{
    @Override
    public void breathe() {
        System.out.println("animal breathe");
    }
}
