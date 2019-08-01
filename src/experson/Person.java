package experson;

public abstract class Person {
	public String default_name = "Person";
	public int default_Energy = 100;
	 

	public Person (String name, int energy) {
		this.default_name = name;
		this.default_Energy= energy;
		
	}

	public String getName () {
		return getName();
	
	}
	
	public int getEnergy() {
	return getEnergy();
}

	
	@Override
	public String toString() {
		return "Person [default_name=" + default_name + ", default_Energy=" + default_Energy + "]";
	}

}