package expersona;

public class Dipendente extends Persona {
	protected static final int DEFAULT_STIPENDIO = 2000;
	protected static final String DEFAULT_NAME = "?";

	private int stipendio;

	public Dipendente(int stipendio, String name) {
		super(name);
		this.stipendio = stipendio;
	}
}