package creacionales.prototype;

public class EnglishGreetingsMessenger implements GreetingsMessenger {
	private String systemName = "undefined";

	public void setSystemName(String name) {
		systemName = name;
	}

	public void sayHi() {
		System.out
				.println("Hi! Welcome to the " + systemName + " application.");
	}

	public void sayGoodbye() {
		System.out.println("Hope you had a good time using " + systemName
				+ "! Bye!");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
