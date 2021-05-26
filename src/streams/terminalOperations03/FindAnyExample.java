package streams.terminalOperations03;

import java.util.stream.Stream;

public class FindAnyExample {

	public static void main(String[] args) {
		/*
		 * The findAny() and findFirst() methods return an element of 
		 * the stream unless the stream is empty.
		 * It's useful when you are working with parallel stream. It gives Java the 
		 * flexibility to return the first element it comes rather than the one that needs
		 * to be first in the stream based on the intermediate operations.
		 */
		Stream<String> s = Stream.of("Argentina","Italia","Deutschland");
		s.findAny().ifPresent(System.out::println);
	}

}
