package streams.terminalOperations02;

import java.util.Optional;
import java.util.stream.Stream;

public class MinExample {

	public static void main(String[] args) {
		/*
		 * The min() and max() methods allow you to pass a custom comparator
		 * and find the smallest or largest value in a finite stream according to that sort order.
		 * For an infinite stream, they hangs.
		 * The return is a Optional rather than the value. This allows the method to soecify
		 * that no minimum or maximum was found.
		 */
		Stream<String> s = Stream.of("Argentina","Italia","Deutschland");
		Optional<String> min = s.min((s1,s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
	}

}
