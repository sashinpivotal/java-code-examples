package _project_scanner_example;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Using Scanner for Getting Input from User
        System.out.println("Enter something and then press Return key!");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}
