package estructurales.decorator;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Este tipo sería un concrete decorator
// Plantear otro decorador
public class DataReaderDatestamp extends DataReaderDecorator {

	public DataReaderDatestamp(DataReader component) {
		super(component);
	}

	public String readFirstName() {
		Calendar now = GregorianCalendar.getInstance();
		int dia = now.get(Calendar.DAY_OF_MONTH);
		int mes = now.get(Calendar.MONTH) + 1;
		int anyo = now.get(Calendar.YEAR);

		System.out.print("<" + dia + "/" + mes + "/" + anyo + "> ");

		return super.readFirstName();

	}

	// No hace falta "decorar" todas las operaciones, sólo las que queramos.
}
