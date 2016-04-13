package creacionales.prototype;

public class PrototypicalTextInterfaceFactory implements TextInterfaceFactory {
	private GreetingsMessenger gm;
	private DataReader dr;

	public PrototypicalTextInterfaceFactory(GreetingsMessenger gm, DataReader dr) {
		this.gm = gm;
		this.dr = dr;
	}

	public GreetingsMessenger createGreetingsMessenger() {
		// Hacer cambios para que GreetingsMessenger sea clonable
		try {
			return (GreetingsMessenger) gm.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public DataReader createDataReader() {
		// Hacer cambios para que DataReader sea clonable
		try {
			return (DataReader) dr.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
