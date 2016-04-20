package MisEjemplos.Estructurales.ADAPTER;

public class PersonaNueva implements IPeronaNueva {

	
	private String nombre;
	private int edad;
	
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		this.edad=edad;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

}
