package MisEjemplos.Estructurales.COMPOSITE;

public class Empleado extends Composite {
	
	private String nombre, cargo;
	private double sueldo;
	
	
	public Empleado(String nombre, String cargo, double sueldo){
		
		setCargo(cargo);
		setNombre(nombre);
		setSueldo(sueldo);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
