package MisEjemplos.PROTOTYPE;

public abstract class TV implements Cloneable {

	private String marca, color;
	private int pulgadas;
	private double precio;
	
	public TV(String marca, String color, int pulgadas, double precio){
	
		this.marca=marca;
		this.color=color;
		this.pulgadas=pulgadas;
		this.precio=precio;
		
	}
	
	public Object Clone() throws CloneNotSupportedException{
		
		return super.clone();
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
