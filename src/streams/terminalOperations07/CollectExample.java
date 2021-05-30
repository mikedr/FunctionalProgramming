package streams.terminalOperations07;

import java.util.Arrays;
import java.util.List;

public class CollectExample {

	public static void main(String[] args) {
		/*
		 * The collect() method is more efficient than a regular reduction because
		 * we use the same mutable object while accumulating.
		 * The first parameter is a Supplier that creates the object that will store 
		 * the results as we collect data.
		 * The second parameter is a BiConsumer, which takes two parameters and doesn't 
		 * return anything. It's responsible for adding one more element to the data collection.
		 * The final parameter is another Bi COnsumer. It's responsible for taking two data 
		 * collections and merging them.
		 */
		List<String> list = Arrays.asList("R","i","v","e","r"," ","P","l","a","t","e");
		StringBuilder word = list.stream().collect(StringBuilder::new,StringBuilder::append,
				StringBuilder::append);
		System.out.println(word);
	}

}
