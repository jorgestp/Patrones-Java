package creacionales.abstractfactory;

public class SpanishTextInterfaceFactory implements TextInterfaceFactory {

	public GreetingsMessenger createGreetingsMessenger() {
		return new SpanishGreetingsMessenger();
	}

	public DataReader createDataReader() {
		return new SpanishDataReader();
	}

}
