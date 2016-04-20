package MisEjemplos.Estructurales.ADAPTER;

import java.sql.Date;

public interface IPersonaVieja {

	
	public void setNombre(String nombre);
	
	public String getNombre();
	
	public void setApellido(String apellido);
	
	public String getApellido();
	
	public Date getFechaNacimiento();
	
	public void setFechaNacimiento(Date fechanacimento );
}

