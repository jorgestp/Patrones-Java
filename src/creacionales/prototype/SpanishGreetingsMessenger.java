package creacionales.prototype;

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

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
