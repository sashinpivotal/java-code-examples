package _part2_8_lambda._01_functional_interface;

public class RunnableExample {
    public static void main(String[] args) {

        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        r1.run();

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");
        r2.run();

    }
}
