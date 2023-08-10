package _04_array_examples;

import java.util.Arrays;

public class ArrayOfInt_Level1 {

    static int[] ints3;
    static String myString;

    public static void main(String[] args) {

        // - How do you create an array of int with
        //   size of 10?
        int[] ints = new int[10];
        System.out.println(Arrays.toString(ints));

        // create an array of String type but the elements are
        // all null at the moment
        String[] strings = new String[5];
        String myString = null;
        System.out.println(strings.length);

        // - Let's say you have the following
        //   numbers: 3,9,6,3,1,10,5
        // - How do you create an array of int?
        int[] ints4 = {3, 9, 6, 3, 1, 10, 5};
        System.out.println(Arrays.toString(ints4));

        // - Let's say you have any array of int
        //   initialized with 3,9,6,2,1,10,5
        // - How do you find the largest number?
        int largestNumberFromInts4Array = ints4[ints4.length/2];
        for (int i = ints4.length - 1; i >=0 ; i--) {
            if (largestNumberFromInts4Array < ints4[i]) {
                largestNumberFromInts4Array = ints4[i];
            }
        }
        System.out.println("first try: " + largestNumberFromInts4Array);

        for (int i = 0; i < ints4.length; i++) {
            if (largestNumberFromInts4Array < ints4[i]) {
                largestNumberFromInts4Array = ints4[i];
            }
        }
        System.out.println("second try: " + largestNumberFromInts4Array);

        // - Let's say you have any array of int
        //   initialized with 3,9,6,2,1,10,5
        // - Change each number in the array
        //   multiplied by 2
        for (int i = 0; i < ints4.length; i++) {
            ints4[i] *= 2;
        }
        System.out.println(Arrays.toString(ints4));

        int currentIndex = 0;
        for (int value : ints4) {
            ints4[currentIndex++] *= 2;
        }
        System.out.println(Arrays.toString(ints4));

    }
}
