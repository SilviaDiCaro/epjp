package b07;

public class S75 {
	public void f() {
		try {
			g();
		} catch (Exception ex) {
			System.out.println("Exception caught");
		} finally {
			cleanup(); // se ho risorse da ripulire, sempre bene usare cleanup. Se ho aperto un file, a
						// fine esecuzione chiudi (indipendentemente dalle eccezioni)
			// Throwable t }
		}
	}

	class PaperinoException extends Exception {
		private static final long serialVersionUID = 1L;

		public PaperinoException(String message) {
			super(message); // chiama il costruttore passando il messaggio che pass l'utente
		}
	}

	int first(int[] values) throws PaperinoException {
		if (values == null || values.length == 0) {
			throw new PaperinoException("values should be not null nor empty!");
			// throw new IllegalArgumentException("values should be not null nor empty!");
		}
		return values[0];

	}

	public void g() throws Exception {
		// ...
		if (somethingUnexpected()) {
			throw new Exception();
		}
		// System.out.println("hello!"); <--anche se ci fosse stato, non avrebbe
		// stampato "hello!" non arriviamo mai alla riga 19
	}

	private void cleanup() {
		System.out.println("performing cleanup");
	}

	private boolean somethingUnexpected() {
		return true;
	}

	public static void main(String[] args) {
		S75 exceptional = new S75();
		exceptional.f();

		try {
			exceptional.first(null);
		} catch (PaperinoException e) {
			// TODO Auto-generated catch block
			System.out.println("Exc: " + e.getMessage());
			;
		}

	}
}
