package misc.examples_not_using_generics;

public class SomeThingInteger {

    private Integer integer;

    public void printSomething() {
        System.out.println(integer);
    }
}

class SomethingLong {
    private Long aLong;

    public void printSomething() {
        System.out.println(aLong);
    }
}

class Main7 {
    public static void main(String[] args) {
        SomeThingInteger someThingInteger = new SomeThingInteger();
        SomethingLong somethingLong = new SomethingLong();
    }
}
