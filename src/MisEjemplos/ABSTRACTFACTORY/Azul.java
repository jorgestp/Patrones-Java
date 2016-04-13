package MisEjemplos.ABSTRACTFACTORY;

public class Azul extends Color{

	@Override
	public void colorea(TV tv) {
		
		System.out.println("Pintando de azul el..." + tv.getDescription());
		
	}
	

}
