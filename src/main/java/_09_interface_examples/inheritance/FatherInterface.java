package _09_interface_examples.inheritance;

public interface FatherInterface {
    void fatherMethod();

    default void dMethod1() {
        System.out.println("dMethod1 from interface");
    }

    default void dMethod2() {
        System.out.println("dMethod2 from interface");
    }
}

class Main {

    public static void main(String[] args) {
        MyImplementationOfChildInterface anInterface
                = new MyImplementationOfChildInterface();
        anInterface.dMethod1();
        anInterface.dMethod2();
    }

}

interface ChildInterface extends FatherInterface {
    void childMethod();
}

class MyImplementationOfChildInterface
        implements ChildInterface {

    @Override
    public void fatherMethod() {

    }

    @Override
    public void childMethod() {

    }

    @Override
    public void dMethod2() {
        System.out.println("dMethod2 in the implementation class ");
    }
}


