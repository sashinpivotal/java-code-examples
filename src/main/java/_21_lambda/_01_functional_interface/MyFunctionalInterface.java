package _21_lambda._01_functional_interface;

@FunctionalInterface
public interface MyFunctionalInterface {
    String makeUpperCase(String string);
}

class Main2 {
    public static void main(String[] args) {

        // Use anonymous inner class
        MyFunctionalInterface myObject1
                = new MyFunctionalInterface() {

            @Override
            public String makeUpperCase(String string) {
                return string.toUpperCase();
            }
        };
        System.out.println(myObject1.makeUpperCase("Boston"));

        // Use Lambda
        MyFunctionalInterface myObject2
                = string -> string.toUpperCase();
        System.out.println(myObject2.makeUpperCase("Boston"));


    }
}