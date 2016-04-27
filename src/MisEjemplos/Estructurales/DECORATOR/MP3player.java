package MisEjemplos.Estructurales.DECORATOR;

public class MP3player extends AutoDecorator {

	public MP3player(Vendible vendible) {
		super(vendible);
	}

	public String getDescription(){
		
		return getVendible().getDescription() + " + MP3 Player";
	}
	
	public int getPrecio(){
		
		return getVendible().getPrecio() +250; 
	}
	
}
