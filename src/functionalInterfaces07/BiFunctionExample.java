package functionalInterfaces07;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		/*
		 * A function is responsible for turning one parameter 
		 * into a value of potentially different type and returning it.
		 */
		String string1 = "Mike";
		String string2 = "Capo";
		BiFunction<String,String,Integer> bF = (s1,s2) -> (s1+s2).length();
		System.out.println("The '"+string1+"' String 1 concatenated with '"+
		string2+"' String 2 has a length of "+bF.apply(string1,string2));
	}

}
