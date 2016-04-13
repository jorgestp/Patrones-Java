package creacionales.factorymethod;

public class GestorBD {
	private String atributos;
	private static GestorBD yomismo = null;

	// ...

	private GestorBD() {
		// ...inicializaciones
	}

	public static GestorBD getInstance() {
		if (yomismo == null)
			yomismo = new GestorBD();

		return yomismo;
	}
}
