package MisEjemplos.Estructurales.ADAPTER;

import java.sql.Date;
import java.util.GregorianCalendar;

public class ViejaToNuevaPersona implements IPeronaNueva {

	
	private PersonaVieja vieja;
	
	public ViejaToNuevaPersona(PersonaVieja vieja){
		
		this.vieja=vieja;
	}
	
	
	
	public void setNombre(String nombre) {
		String [] name=nombre.split(" ");
		String first=name[0];
		String second=name[1];
		vieja.setNombre(first);
		vieja.setApellido(second);

	}

	@Override
	public String getNombre() {
		
		return vieja.getNombre() + " " + vieja.getApellido();
	}

	@Override
	public void setEdad(int edad) {
		
		GregorianCalendar c=new GregorianCalendar();
		
		int anioactual=c.get(1);
		
		c.set(1, anioactual-edad);
		
		vieja.setFechaNacimiento((Date) c.getTime());

	}

	@Override
	public int getEdad() {
		
		GregorianCalendar c=new GregorianCalendar();
		GregorianCalendar c2= new GregorianCalendar();
		
		c2.setTime(vieja.getFechaNacimiento());
		return c.get(1)-c2.get(1);
	}

}
