package _02_enum_examples;

public class Enum_ComputerType {

    // Alternative to Enum
    public static final int PC = 1;
    public static final int TABLET = 2;
    public static final int PHONE = 3;
    public static final int TV = 4;

    public static void main(String[] args) {

        // TODO: Exercise #1
        // - Write an enum class called "ComputerType"
        //   with the following values
        //   - "PC", "TABLET", "PHONE"
        // - Create an array of these enum values
        // - Display the array

        // TODO: Exercise #2
        // - Create a static method called
        //   "buyComputer(..)", which takes "ComputerType"
        //   enum type and quantity
        buyComputerMethodUsingPublicStaticFinalConstants(2, 4);
        buyComputerMethodUsingEnum(ComputerType.TABLET, 3);
    }

    // use public static final
    public static void buyComputerMethodUsingPublicStaticFinalConstants(int computerType, int quantity) {
        System.out.println(computerType);
    }

    // use enum
    public static void buyComputerMethodUsingEnum(ComputerType computerType, int quantity) {
        System.out.println(computerType);
    }


}

enum ComputerType {
    PC,
    TABLET,
    PHONE,
    TV
}


