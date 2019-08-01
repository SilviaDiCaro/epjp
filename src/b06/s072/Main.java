package b06.s072;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = { new Dog("Alpha", 3), new Dog("Beta", 2.41), new Dog("Gamma", 2.42), new Dog("Delta", 2.43),
				new Dog("Epsilon", 2.45), new Dog("Zeta", 2.46) };

		Dog fastest = dogs[0]; // fastest è un reference a Dog che va inizializzato col reference nell'array
								// alla posizione 0

		for (int i = 0; i < dogs.length; i++) {

			if (dogs[i].getSpeed() > fastest.getSpeed()) {
				fastest = dogs[i];

			}
		}
		System.out.println(fastest);
	}
}

// dogs[0].getSpeed()
// getspeed è un metodo di dog, quindi lo posso chiamare

// public double getSpeed() {
// return this.speed

// String name = names.getName();
// double speed = tom.getSpeed();

// System.out.println("Name and speed: " + names + ", " + speed);
