package interface_examples.misc2;

public class Animal implements Breathable{
    @Override
    public void breathe() {
        System.out.println("animal breathe");
    }
}
