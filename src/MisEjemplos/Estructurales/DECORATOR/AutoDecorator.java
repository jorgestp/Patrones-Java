package MisEjemplos.Estructurales.DECORATOR;

public class AutoDecorator implements Vendible {


	private Vendible vendible;
	
	public AutoDecorator(Vendible vendible){
		
		setVendible(vendible);
	}
	
	
	
	public Vendible getVendible() {
		return vendible;
	}



	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}



	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
