package _part2_8_lambda.streams_refactored_example1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	//
	// Non-stream operation (external iteration)
	//
	private static int computeSumNotUsingStream(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

	//
	// Stream operation (internal iteration)
	//
	private static int computeSumUsingStream(List<Integer> list) {
		return list.stream()
				.filter(i -> i > 10)
				.mapToInt(i -> i)
				.sum();
	}

	private static int computeSumUsingStreamParallel(List<Integer> list) {
		return list.parallelStream()
				.filter(i -> i > 10)
				.mapToInt(i -> i)
				.sum();
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 8, 14, 11);

		// Compute sum of numbers that are greater than 10
		System.out.println("computeSumNotUsingStream = " + computeSumNotUsingStream(list));
		System.out.println("computeSumUsingStream = " + computeSumUsingStream(list));
		System.out.println("computeSumUsingStreamParallel = " + computeSumUsingStreamParallel(list));

		// TODO:
		// - Create Stream-based method, in which you filter only  
		//   the numbers less than 9 and them compute sum of it
		
	}
	
}
