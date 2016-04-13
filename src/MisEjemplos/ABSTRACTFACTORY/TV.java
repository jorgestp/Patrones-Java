package MisEjemplos.ABSTRACTFACTORY;

public abstract class TV {

	private String marca, descripcion, color;
	private int pulgada;
	private double precio;
	
	public TV(){
		
	}
	
	public TV(String marca, String color, int pulgada, double precio){
		
		this.marca=marca;
		this.color=color;
		this.pulgada=pulgada;
		this.precio=precio;
	}
	
	public void setDescripcion( String text){
		
		descripcion=text;
	}
	
	public String getDescription(){
		return descripcion;
	}
}
