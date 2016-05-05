package MisEjemplos.Estructurales.FLYWEIGHT;

public class Alumno {
	
	private String nombre, apellido;
	private double promedio, promedioGeneral;
	
	public Alumno(double promedioGeneral){
		
		setPromedioGeneral(promedioGeneral);
	}

	
	public double compara(){
		//devuelve el porcentaje que difiere del promedio 
		return (promedio/promedioGeneral -1)*100;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public double getPromedioGeneral() {
		return promedioGeneral;
	}

	public void setPromedioGeneral(double promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}

}
