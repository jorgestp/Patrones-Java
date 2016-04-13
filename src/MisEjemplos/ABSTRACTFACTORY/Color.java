package MisEjemplos.ABSTRACTFACTORY;

public abstract class Color {
	private String descripcion;
	
	public abstract void colorea(TV tv);
	

	public String getDescption(){
		return descripcion;
	}
	
	public void setDescription( String text){
		descripcion=text;
	}
}
