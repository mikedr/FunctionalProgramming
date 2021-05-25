package functionalInterfaces04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		/*
		 * Predicate is often used when filtering or matching.
		 */
		Predicate<String> p = s -> s.isEmpty();
		System.out.println("Is a empty String? "+p.test(""));
	}

}
