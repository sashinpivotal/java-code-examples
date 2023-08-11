package _21_lambda._02_lambda_basics;

public class Main {

    public static void main(String[] args) {

        // example of assigning lambda's into variables
        Calculator multiplier = (x, y) -> x * y;
        Calculator divider = (x, y) -> x / y;
        Calculator adder = (x, y) -> {
            System.out.println("something");
            return x + y;
        };

        int result1 = multiplier.calculate(20, 30);
        System.out.println("multiply result = " + result1);
        int result2 = divider.calculate(30, 10);
        System.out.println("divide result = " + result2);

        // example of passing lambda's as method arguments
        myMethod(((x, y) -> x * y), (x, y) -> x / y);
        myMethod(multiplier, divider);

        // example of returning lambda
        Calculator calculator = myMethod2();
        int result3 = calculator.calculate(10, 20);
        System.out.println("result3 = " + result3);

    }

    public static void myMethod(Calculator calculator1, Calculator calculator2) {
        int result1 = calculator1.calculate(30, 10);
        int result2 = calculator2.calculate(200, 50);
        System.out.println("result1 = " + result1 + ", result2 = " + result2);
    }

    public static Calculator myMethod2() {
       return (x, y) -> x * y;
    }

}

