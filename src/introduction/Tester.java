package introduction;

public class Tester {

	public static void main(String[] args) {
		print (new Animal("Fish",false,true),a -> a.canSwim());
		print (new Animal("Dog",false,false),a -> a.canHoop());
	}

	public static void print(Animal a, TestAnimal tester) {
		if(tester.testAnimal(a)) {
			System.out.println(a.getName()+" Test passed");
		} else {
			System.out.println(a.getName()+" Test failed");
		}
	}
}
