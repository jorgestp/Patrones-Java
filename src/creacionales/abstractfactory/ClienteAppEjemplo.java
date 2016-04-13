package creacionales.abstractfactory;

public class ClienteAppEjemplo {

	public static void main(String[] args) {
		AppEjemplo app = new AppEjemplo(new SpanishTextInterfaceFactory());
		
		app.run();
	}
}
