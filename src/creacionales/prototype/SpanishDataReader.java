package creacionales.prototype;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpanishDataReader implements DataReader {
	private BufferedReader bufferRead = new BufferedReader(
			new InputStreamReader(System.in));

	public String readFirstName() {
		System.out.println("¿Cúal es tu nombre?: ");
		try {
			return bufferRead.readLine();
		} catch (Exception e) {
			return "Error";
		}
	}

	public String readLastName() {
		System.out.println("¿Cuáles son tus apellidos?: ");
		try {
			return bufferRead.readLine();
		} catch (Exception e) {
			return "Error";
		}
	}

	public Integer readAge() {
		System.out.println("¿Cuántos años tienes?: ");
		try {
			return new Integer(bufferRead.readLine());
		} catch (Exception e) {
			return -1;
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
