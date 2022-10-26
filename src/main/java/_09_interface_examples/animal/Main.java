package _09_interface_examples.animal;

public class Main {

    static Breathable[] breathables = new Breathable[10];
    static int currentIndex = 0;

    public static void main(String[] args) {
        Breathable animal = new Animal();
        Breathable human = new Human();

        breathables[currentIndex++] = animal;
        breathables[currentIndex++] = human;

        for (int i = 0; i < currentIndex; i++) {
            breathables[i].breathe();
        }

    }
}
