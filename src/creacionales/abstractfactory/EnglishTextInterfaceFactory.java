package creacionales.abstractfactory;

public class EnglishTextInterfaceFactory implements TextInterfaceFactory {
	private static EnglishTextInterfaceFactory yomismo = null;
	
	private EnglishTextInterfaceFactory(){
	}
	
	public static EnglishTextInterfaceFactory getInstance(){
		if(yomismo==null)
			yomismo=new EnglishTextInterfaceFactory();
		return yomismo;
	}
	
	
	public GreetingsMessenger createGreetingsMessenger() {
		return new EnglishGreetingsMessenger();
	}

	public DataReader createDataReader() {
		return EnglishDataReader.getInstance();
	}

}
