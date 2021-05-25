package functionalInterfaces02;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		/*
		 * You use a Consumer when you want to do 
		 * something with a parameter but not return anything
		 */
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Print this example for Consumer");
	}

}
