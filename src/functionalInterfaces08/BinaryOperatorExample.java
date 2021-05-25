package functionalInterfaces08;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		/*
		 * A Binary Operator merges two values into one of the same type.
		 */
		BinaryOperator<Integer> b = (s1,s2) -> s1+s2;
		System.out.println("4 + 8 = "+b.apply(4, 8));
	}

}
