package estructurales.adapter;

public class Cliente {

	private Fecha fecha1;

	// ...
	public void inicializaFecha() {
		fecha1 = new CalendarToFechaObjectAdapter(1, 1, 1970);
	
	}

	public void hazAlgo() {
		fecha1.setDia(fecha1.getDia() + 1);
		// ...
	}

}
