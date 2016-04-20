package estructurales.decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnglishDataReader implements DataReader {
	// Singleton
	private static EnglishDataReader singleton = null;

	private BufferedReader bufferRead = new BufferedReader(
			new InputStreamReader(System.in));

	private EnglishDataReader() {

	}

	public static EnglishDataReader getInstance() {
		if (singleton == null) {
			singleton = new EnglishDataReader();
		}
		return singleton;
	}

	public String readFirstName() {
		System.out.println("What's your first name?: ");
		try {
			return bufferRead.readLine();
		} catch (Exception e) {
			return "Error";
		}
	}

	public String readLastName() {
		System.out.println("What's your last name?: ");
		try {
			return bufferRead.readLine();
		} catch (Exception e) {
			return "Error";
		}
	}

	public Integer readAge() {
		System.out.println("What's your age?: ");
		try {
			return new Integer(bufferRead.readLine());
		} catch (Exception e) {
			return -1;
		}
	}

}
