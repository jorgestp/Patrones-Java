package MisEjemplos.Estructurales.DECORATOR;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
		
		
	}
	
	public String getDescription(){
		
		return getVendible().getDescription() + " + Aire Acondicionado";
	}
	
	public int getPrecio(){
		
		return getVendible().getPrecio() +1500; 
	}
	
	

}
