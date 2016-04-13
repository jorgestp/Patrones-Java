package MisEjemplos.ABSTRACTFACTORY;

public class Amarillo extends Color {

	@Override
	public void colorea(TV tv) {
	
		System.out.println("Pintando de amarillo el..." + tv.getDescription());
	}

}
