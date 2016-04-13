package creacionales.prototype;

public class AppSimple {
	private TextInterfaceFactory tui;

	public AppSimple(TextInterfaceFactory t) {
		tui = t;
	}

	public void setTextInterfaceFactory(TextInterfaceFactory t) {
		tui = t;
	}

	public void run() {
		GreetingsMessenger gm = tui.createGreetingsMessenger();
		gm.setSystemName("App Simple");
		gm.sayHi();

		DataReader dr = tui.createDataReader();
		String name = dr.readFirstName();
		String lastName = dr.readLastName();
		Integer age = dr.readAge();

		// .. Aquí supongo que se haría...

		gm.sayGoodbye();
	}
}
