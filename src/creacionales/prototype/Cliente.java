package creacionales.prototype;

public class Cliente {

	public static void main(String[] args) {

		AppSimple app = new AppSimple(new PrototypicalTextInterfaceFactory(
				new EnglishGreetingsMessenger(), new SpanishDataReader()));
		app.run();
	}
}
