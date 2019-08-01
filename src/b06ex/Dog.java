package b06ex;

public class Dog {
	protected static final int DEFAULT_WEIGHT = 10;
	protected static final String DEFAULT_NAME = "?";

	private int weight;
	private String name;

	public Dog() {
		this(DEFAULT_NAME);

	}

	public Dog(String name) {
		this(DEFAULT_WEIGHT, name);

	}

	public Dog(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ": " + this.weight;
	}
}