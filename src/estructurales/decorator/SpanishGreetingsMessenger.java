package estructurales.decorator;

public class SpanishGreetingsMessenger implements GreetingsMessenger {
	private String systemName = "undefined";

	public void setSystemName(String name) {
		systemName = name;
	}

	public void sayHi() {
		System.out.println("¡Hola! Bienvenido a la aplicación " + systemName);
	}

	public void sayGoodbye() {
		System.out
				.println("Esperamos que hayas pasado un buen rato. ¡Hasta pronto!");
	}

}
