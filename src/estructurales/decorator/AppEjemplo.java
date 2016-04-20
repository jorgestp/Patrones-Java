package estructurales.decorator;

public class AppEjemplo {
	// Por defecto, la app funciona en inglés
	private TextInterfaceFactory tui;

	public AppEjemplo() {
		tui = new EnglishTextInterfaceFactory();
	}

	public void run() {
		GreetingsMessenger salutti = tui.createGreetingsMessenger();
		salutti.setSystemName("App Ejemplo");
		salutti.sayHi();

		DataReader reader = tui.createDataReader();
		String name = reader.readFirstName();
		String lastName = reader.readLastName();
		Integer age = reader.readAge();

		// ... aquí el resto de la lógica de esta extraña app...

		salutti.sayGoodbye();
	}

	public void setTextInterface(TextInterfaceFactory t) {
		tui = t;
	}

}
