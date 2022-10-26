package _07_abstract_examples.misc;

public abstract class MyAbstractClass {

    private int myInstanceInt;

    public MyAbstractClass(int myInstanceInt) {
        this.myInstanceInt = myInstanceInt;
    }

    public abstract void myMethod();
}

class ChildClass1 extends MyAbstractClass {

    public ChildClass1(int myInstanceInt) {
        super(myInstanceInt);
    }

    @Override
    public void myMethod() {

    }
}

class ChildClass2 extends MyAbstractClass {

    public ChildClass2(int myInstanceInt) {
        super(myInstanceInt);
    }

    @Override
    public void myMethod() {

    }
}

class Main {
    public static void main(String[] args) {

    }
}
