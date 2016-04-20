package estructurales.decorator;

public abstract class DataReaderDecorator implements DataReader {
	private DataReader component;

	public DataReaderDecorator(DataReader component) {
		this.component = component;
	}

	public String readFirstName() {
		return component.readFirstName();
	}

	public String readLastName() {
		return component.readLastName();
	}

	public Integer readAge() {
		return component.readAge();
	}
}
