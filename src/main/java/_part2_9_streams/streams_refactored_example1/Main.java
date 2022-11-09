package _part2_9_streams.streams_refactored_example1;

import java.util.Arrays;
import java.util.List;

// Compute sum of the numbers that are greater than 10
// from number list.
public class Main {

    //
    // Non-stream operation (external iteration)
    //
    private static int
    computeSumWithValuesGreaterThan10NotUsingStream(List<Integer> list) {
        int sum = 0;
        int currentIndex = 0;
        for (Integer integer : list) {
            if (list.get(currentIndex) > 10) {
                sum += list.get(currentIndex);
            }
            currentIndex++;

        }
        return sum;
    }

    //
    // Stream operation (internal iteration)
    //
    private static int
    computeSumWithValuesGreaterThan10UsingStream(List<Integer> list) {
        return list.stream()
                .filter(i -> i > 10)
                // - The following operation is needed to convert current
                //   stream to IntStream, over which other Integer operations
                //   can be performed like sum,Min,max etc.
                // - Omitting will result in sum() in compiler error.
                .mapToInt(i -> i)
                .sum();
    }

    private static int
    computeSumWithValuesGreaterThan10UsingStreamParallel(List<Integer> list) {
        return list.parallelStream()
                .filter(i -> i > 10)
                .mapToInt(i -> i)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 8, 14, 11);

        // Compute sum of numbers that are greater than 10
        System.out.println("computeSumWithValuesGreaterThan10NotUsingStream = "
                + computeSumWithValuesGreaterThan10NotUsingStream(list));
        System.out.println("computeSumWithValuesGreaterThan10UsingStream = "
                + computeSumWithValuesGreaterThan10UsingStream(list));
        System.out.println("computeSumWithValuesGreaterThan10UsingStreamParallel = "
                + computeSumWithValuesGreaterThan10UsingStreamParallel(list));

        // TODO:
        // - Create Stream-based method, in which you filter only
        //   the numbers less than 9 and them compute max number of of it
        List<String> numberStrings = Arrays.asList("3", "8", "14", "11");

    }

}
