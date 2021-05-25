package functionalInterfaces08;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		/*
		 * A Unary Operator transforms its value into one of the same type.
		 */
		String string = "Mike";
		UnaryOperator<String> u = s -> s.toUpperCase();
		System.out.println("The '"+string+"' String to Upper Case is "+u.apply(string));
	}

}
