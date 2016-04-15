package MisEjemplos.PROTOTYPE;

public class Main {

	public static void main(String[] args) throws Exception {
		
	TVprototype prot=new TVprototype();
	
	TV tv= (TV) prot.prototipo("Plasma");
	
	System.out.println(tv.getColor());

	}

}
