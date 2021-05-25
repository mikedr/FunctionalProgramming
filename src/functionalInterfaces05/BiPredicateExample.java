package functionalInterfaces05;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		/*
		 * Same than Predicate except that it takes two parameters.
		 */
		BiPredicate<String,Integer> bP = (s,i) -> (!s.isEmpty() && (i%2==0));
		System.out.println("String is not empty and the number is even? "+bP.test("String", 8));
	}

}
