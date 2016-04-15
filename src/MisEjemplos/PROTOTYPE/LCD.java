package MisEjemplos.PROTOTYPE;

public class LCD extends TV{

	private double CostoFabricacion;
	
	public LCD(String marca, String color, int pulgadas, double precio, double costo) {
		super(marca, color, pulgadas, precio);
		
		CostoFabricacion=costo;
	}

	public double getCostoFabricacion() {
		return CostoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		CostoFabricacion = costoFabricacion;
	}

}
