package functionalInterfaces01;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<LocalDate> s = () -> LocalDate.now();
		System.out.println("Today is "+s.get());
	}

}
