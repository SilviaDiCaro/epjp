package experson;

public class Villain extends Person{
	
	private int shootingPower;
	
	public Villain(String name, int energy, int shootingPower) {
		super(name, energy);
		this.shootingPower = shootingPower;
	}
	

	public void ShootPower (Person p) {
		p.changeEnergy(shootingPower); //quanti punti perdi per sparare
		 }
	
	
	@Override
	public String toString() {
		return "Villain [shootingPower=" + shootingPower  + super.toString() + "]";
	}


}
