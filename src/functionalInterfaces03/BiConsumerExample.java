package functionalInterfaces03;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		/*
		 * BiConsumer is called with two parameters.
		 * They don't have to be the same type.
		 */
		Map<String,Integer> map = new HashMap<>();
		BiConsumer<String,Integer> bC = (s,i) -> map.put(s, i);
		bC.accept("Uno",1);
		System.out.println(map);
	}

}
