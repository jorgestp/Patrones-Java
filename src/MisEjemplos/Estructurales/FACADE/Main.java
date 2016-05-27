package MisEjemplos.Estructurales.FACADE;

public class Main {

	public static void main(String[] args) {

		Cliente c= new Cliente();
		Interesado i = new Interesado();
		
		Inmobiliaria inm= new Inmobiliaria();
		
		inm.atencion(c);
		inm.atencion(i);
	
		
		
	}

}
