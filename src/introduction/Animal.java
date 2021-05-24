package introduction;

public class Animal {

	private boolean canHoop;
	private boolean canSwim;
	private String name;
	
	public Animal(String name, boolean canHoop, boolean canSwim) {
		this.name = name;
		this.canHoop = canHoop;
		this.canSwim = canSwim;
	}
	
	public boolean canHoop() {
		return canHoop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}

	public String getName() {
		return name;
	}
	
}
