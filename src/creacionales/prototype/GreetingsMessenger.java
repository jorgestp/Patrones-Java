package creacionales.prototype;

public interface GreetingsMessenger extends Cloneable {
	void setSystemName(String name);

	void sayHi();

	void sayGoodbye();

	public Object clone() throws CloneNotSupportedException;

}
