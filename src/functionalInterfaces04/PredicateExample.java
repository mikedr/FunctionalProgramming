package functionalInterfaces04;

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
