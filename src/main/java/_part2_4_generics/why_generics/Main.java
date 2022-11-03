package _part2_4_generics.why_generics;

public class Main {

    // This is a main method
    public static void main(String[] args) {

        // Using non-generic class
        MyClassWithInteger myClassWithInteger
                = new MyClassWithInteger();
        MyClassCustomer myClassCustomer
                = new MyClassCustomer();

        // Using generic class
        MyClassWithGenerics<Integer> integerMyClassWithGenerics
                = new MyClassWithGenerics<>();
        MyClassWithGenerics<Customer> customerMyClassWithGenerics
                = new MyClassWithGenerics<>();
    }
}
