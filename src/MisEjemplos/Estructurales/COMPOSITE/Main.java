package MisEjemplos.Estructurales.COMPOSITE;

public class Main {

	public static void main(String[] args) {

		Composite composite=new Composite();
		Empleado cajero1=new Empleado("Jorge", "desarrollador", 25000);
		Empleado cajero2 = new Empleado("Juan", "administrativo", 15000);
		composite.agrega(cajero1);
		composite.agrega(cajero2);
		
		System.out.println(composite.getSueldo());
	}

}
