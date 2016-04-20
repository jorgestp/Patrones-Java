package estructurales.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

// Otro ejemplo del patrón Adapter

public class BufferedReaderAdapter extends BufferedReader implements DataReader {

	public BufferedReaderAdapter(Reader reader) {
		super(reader);
	}

	@Override
	public String readFirstName() {
		try {
			return readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public String readLastName() {
		try {
			return readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public Integer readAge() {
		try {
			return new Integer(readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
