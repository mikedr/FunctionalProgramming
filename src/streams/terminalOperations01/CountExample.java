package streams.terminalOperations01;

import java.util.stream.Stream;

public class CountExample {

	public static void main(String[] args) {
		/*
		 * The count() method determines the number of elements in a finite stream.
		 * For an infinite stream, it hangs.
		 */
		Stream<String> s = Stream.of("Pratto","Quinteros","Martinez");
		System.out.println("Number of elements: "+s.count());
	}

}
