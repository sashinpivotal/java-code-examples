package misc.examples_using_generics;

public class SomeThingUsingGenerics<E> {

    private E e;

    public void printSomething(E e) {
        System.out.println(e);
    }
}


// I am Sang's collaborating developer
// line number 1
// line number 2
class Main9 {
    public static void main(String[] args) {
        SomeThingUsingGenerics<Integer> integerSomeThingUsingGenerics
                = new SomeThingUsingGenerics<>();
        SomeThingUsingGenerics<Long> longSomeThingUsingGenerics
                = new SomeThingUsingGenerics<>();
    }
}


