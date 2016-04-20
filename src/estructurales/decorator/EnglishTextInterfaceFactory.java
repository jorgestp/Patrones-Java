package estructurales.decorator;

public class EnglishTextInterfaceFactory implements TextInterfaceFactory {
 
	public GreetingsMessenger createGreetingsMessenger() {
		return new EnglishGreetingsMessenger();
	}

	public DataReader createDataReader() {
		return EnglishDataReader.getInstance();
	}

}
