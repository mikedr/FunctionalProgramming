package functionalInterfaces06;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		/*
		 * A function is responsible for turning one parameter 
		 * into a value of potentially different type and returning it.
		 */
		String string = "Mike";
		Function<String,Integer> f = s -> s.length();
		System.out.println("The "+string+" String has a length of "+f.apply(string));
	}

}
