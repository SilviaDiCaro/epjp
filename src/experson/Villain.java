package experson;

public class Villain extends Person{
	
	private double ShootingPower;
	
	public Villain(String name, int energy, double ShootingPower) {
		super(name, energy);
		this.ShootingPower = ShootingPower;
	}
	

	public double shoot () {
		return ShootingPower;
	}

}
