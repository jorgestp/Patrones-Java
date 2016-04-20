package estructurales.decorator;

public class ClienteAppEjemplo {

	public static void main(String[] args) {
		AppEjemplo app = new AppEjemplo();
		app.setTextInterface(new SpanishTextInterfaceFactory());
		app.run();
	}
}
