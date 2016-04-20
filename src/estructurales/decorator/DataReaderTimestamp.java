package estructurales.decorator;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Este tipo sería un concrete decorator
// Plantear otro decorador
public class DataReaderTimestamp extends DataReaderDecorator {

	public DataReaderTimestamp(DataReader component) {
		super(component);
	}

	public String readFirstName() {
		Calendar now = GregorianCalendar.getInstance();
		int hora = now.get(Calendar.HOUR_OF_DAY);
		int minutos = now.get(Calendar.MINUTE);

		System.out.print("<" + hora + ":" + minutos + "> ");
		return super.readFirstName();
	}

	// No hace falta "decorar" todas las operaciones, sólo las que queramos.
}
