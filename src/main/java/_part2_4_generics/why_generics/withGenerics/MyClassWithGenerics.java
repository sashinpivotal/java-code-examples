package _part2_4_generics.why_generics.withGenerics;

public class MyClassWithGenerics<E> {

    private E e;

    public void display() {
        System.out.println(e);
    }
}
