package _03_autoboxing_examples;

import java.util.Arrays;

public class Autoboxing_Level1 {

    // - Create an array of Integer called "myIntegerArray"
    //   and assign primitive int values 1,2,3,4,5,6 to it
    // - Create a new array of int called "myIntArray" and
    //   initialize it with the values of the "myIntegerArray"
    //   array

    public static void main(String[] args) {
        // example of auto-boxing
        Integer[] myIntegerArray = {1, 2, 3, 4, 5, 6,};

        // example of unboxing
        int myInt = new Integer(4);

        // example of unboxing
        int[] anotherIntArray = new int[10]; // example of creating an array with fixed size
        int[] myIntArray = new int[myIntegerArray.length];
        for (int i = 0; i < myIntegerArray.length; i++) {
            myIntArray[i] = myIntegerArray[i]; // example of unboxing
        }

        System.out.println(Arrays.toString(myIntArray));

    }

}
