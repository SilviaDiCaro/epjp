package experson;

public class Hero extends Person {
	
	private double Arrest;
	public Hero (String name, int energy, double arrest) {
		super(name, energy);
		this.Arrest = Arrest;

}
	public double arrest () {
	return Arrest;
	}
}