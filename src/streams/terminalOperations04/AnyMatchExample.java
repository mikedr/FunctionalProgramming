package streams.terminalOperations04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchExample {

	public static void main(String[] args) {
		/*
		 * The allMatch(), anyMatch() and noneMatch() methods search a stream and
		 * return information about how the stream pertains to the predicate.
		 */
		List<String> list = Arrays.asList("Argentina","Italia","Deutschland");
		Predicate<String> pred = x -> Character.valueOf(x.charAt(0)).equals('A');
		System.out.println("Is there any string which starts with 'A': "+list.stream().anyMatch(pred));
		System.out.println("All strings start with 'A': "+list.stream().allMatch(pred));
		System.out.println("None string starts with 'A': "+list.stream().noneMatch(pred));
	}

}
