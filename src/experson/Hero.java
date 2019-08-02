package experson;

public class Hero extends Person {
	
	private int bonus;
	public Hero (String name, int energy, int bonus) {
		super(name, energy);
		this.bonus = bonus;

}
	public boolean arrest (Person p) {
	return true;
	}

}



