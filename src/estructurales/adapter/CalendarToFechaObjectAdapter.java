package estructurales.adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarToFechaObjectAdapter implements Fecha {
	private Calendar adaptee;

	public CalendarToFechaObjectAdapter(int dia, int mes, int anyo) {
		adaptee = new GregorianCalendar(anyo, mes - 1, dia);
	}

	public void setAdaptee(Calendar c) {
		adaptee = c;
	}

	public int getDia() {
		return adaptee.get(Calendar.DAY_OF_MONTH);
	}

	public int getMes() {
		return adaptee.get(Calendar.MONTH) + 1;
	}

	public int getAnyo() {
		return adaptee.get(Calendar.YEAR);
	}

	public void setDia(int dia) {
		adaptee.set(Calendar.DAY_OF_MONTH, dia);
	}

	public void setMes(int mes) {
		adaptee.set(Calendar.MONTH, mes);
	}

	public void setAnyo(int anyo) {
		adaptee.set(Calendar.YEAR, anyo);
	}
}
