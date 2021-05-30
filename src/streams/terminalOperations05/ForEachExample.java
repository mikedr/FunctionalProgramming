package streams.terminalOperations05;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		/*
		 * A looping construct.
		 */
		List<String> list = Arrays.asList("Argentina","Italia","Deutschland");
		list.stream().forEach(System.out::println);
	}

}
