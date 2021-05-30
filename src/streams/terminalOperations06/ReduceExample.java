package streams.terminalOperations06;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		/*
		 * The reduce() method combines a stream into a single object.
		 */
		List<String> list = Arrays.asList("Argentina","Italia","Deutschland");
		System.out.println(list.stream().reduce("", (s,c) -> s+c));
		List<Integer> listTwo = Arrays.asList(2,4,10);
		System.out.println(listTwo.stream().reduce((x,y) -> x*y));
	}

}
