package experson;

public class CommonPerson extends Person {

	@Override
	public String toString() {
		return "CommonPerson [toString()=" + super.toString() + "]";
	}

	public CommonPerson(String name, int energy) {
		super(name, energy);
			}
}

