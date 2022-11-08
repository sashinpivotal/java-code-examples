package _part2_8_lambda._01_anonymous_inner_class;

public interface MyInterface {

    String makeUpperCase(String string);
    String makeLowerCase(String string);
}

class Main1 {

    public static void main(String[] args) {
        MyInterface myObject = new MyInterface(){

            @Override
            public String makeUpperCase(String string) {
                return string.toUpperCase();
            }

            @Override
            public String makeLowerCase(String string) {
                return string.toLowerCase();
            }
        };

        String boston = myObject.makeLowerCase("Boston");
        System.out.println(boston);
        String new_york = myObject.makeUpperCase("New York");
        System.out.println(new_york);
    }
}
