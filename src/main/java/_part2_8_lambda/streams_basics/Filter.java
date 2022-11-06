package _part2_8_lambda.streams_basics;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(p -> p > 6)
                .forEach(p -> System.out.println(p + " "));
    }
}
