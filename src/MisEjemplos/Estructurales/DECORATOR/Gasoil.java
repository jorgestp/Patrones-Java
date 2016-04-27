package MisEjemplos.Estructurales.DECORATOR;

public class Gasoil extends AutoDecorator {

	public Gasoil(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	
	public String getDescription(){
		
		return getVendible().getDescription() + " + Gasoil";
	}
	
	public int getPrecio(){
		
		return getVendible().getPrecio() +1200; 
}

}