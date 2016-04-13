package creacionales.abstractfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnglishDataReaderSingleton implements DataReader {
	private static EnglishDataReaderSingleton singleton;

	private BufferedReader bufferRead = new BufferedReader(
			new InputStreamReader(System.in));

	private EnglishDataReaderSingleton() {
	}

	public static EnglishDataReaderSingleton getInstance() {
		if (singleton == null) {
			singleton = new EnglishDataReaderSingleton();
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
