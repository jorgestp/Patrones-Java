package creacionales.prototype;

public interface DataReader extends Cloneable {
	String readFirstName();

	String readLastName();

	Integer readAge();

	public Object clone() throws CloneNotSupportedException;
}
