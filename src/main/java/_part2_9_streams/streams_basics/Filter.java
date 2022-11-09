package _part2_9_streams.streams_basics;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(p -> p > 6)
                .forEach(p -> System.out.println(p + " "));

        List<String> numberStrings
                = Arrays.asList("5", "16", "8", "24", "5");
        int sum1 = numberStrings.stream()                  // convert the List to  sequential stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                      // perform sum operation
        System.out.println(sum1);

        int sum2 = numberStrings.parallelStream()                  // convert the List to  parallel stream
                .mapToInt(stringNumber -> Integer.parseInt(stringNumber))
                .filter(i -> i > 10)       // filter only the number > 10  (Predicate)
                .sum();                      // perform sum operation
        System.out.println(sum2);

    }
}
