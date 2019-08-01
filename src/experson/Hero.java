package experson;

public class Hero extends Person {
	
	private double Arrest;
	public Hero (String name, int energy, double Arrest) {
		super(name, energy);
		this.Arrest = Arrest;

}
	public double shoot () {
	return Arrest;
	}
}