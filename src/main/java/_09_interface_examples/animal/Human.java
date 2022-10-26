package _09_interface_examples.animal;

public class Human implements Breathable{
    @Override
    public void breathe() {
        System.out.println("human breathe");
    }
}


