package estructurales.decorator;

public class SpanishTextInterfaceFactory implements TextInterfaceFactory {

	public GreetingsMessenger createGreetingsMessenger() {
		return new SpanishGreetingsMessenger();
	}

	public DataReader createDataReader() {
		return new DataReaderDatestamp(new DataReaderTimestamp(
				new SpanishDataReader()));
	}

}
