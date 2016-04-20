package estructurales.adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Hacer también mediante Object Adapter
public class CalendarToFechaAdapter extends GregorianCalendar implements Fecha {
	public CalendarToFechaAdapter(int dia, int mes, int anyo) {
		super(anyo, mes - 1, dia);
	}

	public int getDia() {
		return get(Calendar.DAY_OF_MONTH);
	}

	public int getMes() {
		return get(Calendar.MONTH) + 1;
	}

	public int getAnyo() {
		return get(Calendar.YEAR);
	}

	public void setDia(int dia) {
		set(Calendar.DAY_OF_MONTH, dia);
	}

	public void setMes(int mes) {
		set(Calendar.MONTH, mes);
	}

	public void setAnyo(int anyo) {
		set(Calendar.YEAR, anyo);
	}
}
