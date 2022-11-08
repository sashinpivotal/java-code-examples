package _part2_8_lambda._02_lambda_basics;

@FunctionalInterface interface Calculator {
    int calculate(int x, int y);
}

public class Main {

    public static void main(String[] args) {

        // example of assigning lambda into a variable
        Calculator multiply = (x, y) -> x * y;
        Calculator divide = (x, y) -> x / y;
        Calculator add = (x, y) -> {
            System.out.println("something");
            return x + y;
        };

        int result1 = multiply.calculate(20, 30);
        System.out.println(result1);
        int result2 = divide.calculate(30, 10);
        System.out.println(result2);

        // example of passing lambda as method arguments
        myMethod(((x, y) -> x * y), (x, y) -> x / y);
        myMethod(multiply, divide);

        // Runnable example
        Runnable runnable = () -> System.out.println("hello I am runnable");
        runnable.run();
    }

    public static void myMethod(Calculator m, Calculator d) {
        int product = m.calculate(30, 10);
        int quotient = d.calculate(200, 50);
        System.out.println(product + " " + quotient);
    }
}

