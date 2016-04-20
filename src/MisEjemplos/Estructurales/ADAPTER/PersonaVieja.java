package MisEjemplos.Estructurales.ADAPTER;

import java.sql.Date;

public class PersonaVieja implements IPersonaVieja {
	
	private String nombre, apellido;
	private Date fecha;

	@Override
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
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		this.apellido=apellido;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return apellido;
	}

	@Override
	public Date getFechaNacimiento() {
		// TODO Auto-generated method stub
		return fecha;
	}

	@Override
	public void setFechaNacimiento(Date fechanacimento) {
		// TODO Auto-generated method stub
		fecha=fechanacimento;
	}

}
