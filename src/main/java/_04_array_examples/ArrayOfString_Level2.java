package _04_array_examples;

import java.util.Arrays;

public class ArrayOfString_Level2 {

    public static void main(String[] args) {

        // TODO: Exercise #1
        // - Create an array of String by using "split" method
        //   from "I love Boston.  Yes, you do love boston."
        //   using "[, ?.@]+" as regular expression
        // - Display the array
        String testString = "I love Boston.  Yes, you do love boston.";
        String[] strings = testString.split("[, ?.@&$]+");

        // TODO: Exercise #2
        // - Create a new array of String with unique word (but
        //   case-insensitive manner) from
        //   the array of String that was created above.
        //   The resulting array should be all lower-case, however.
        //   In other words, the new array should contain
        //   "i", "love", "boston", "yes", "do" as it's
        //   element values
        // - Display the array
        String[] uniqueWords = new String[strings.length];
        int currentIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (!isWordAlreadyEncountered(uniqueWords, strings[i], currentIndex)) {
                uniqueWords[currentIndex++] = strings[i];
            }
        }
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(uniqueWords[i] + " ");
        }
        System.out.println();

        // TODO: Exercise #3
        // - Create an array of "char" from a String "Life is good"
        // - See if String class has a method that returns char on index
        // - Display the array
        String testString2 = "Life is good";
        char[] chars = new char[testString2.length()];
        for (int i = 0; i < testString2.length(); i++) {
            chars[i] = testString2.charAt(i);
        }
        System.out.println(Arrays.toString(chars));


    }

    private static boolean isWordAlreadyEncountered(String[] uniqueWords, String string, int currentIndex) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (uniqueWords[i].equalsIgnoreCase(string)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
