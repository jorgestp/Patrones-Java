package MisEjemplos.Estructurales.ADAPTER;

import java.sql.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		PersonaVieja vieja=new PersonaVieja();
		vieja.setNombre("Maxi");
		vieja.setApellido("Pérez");
		GregorianCalendar g=new GregorianCalendar();
		g.set(2000, 01, 01);
		
		java.util.Date d= g.getTime();
		vieja.setFechaNacimiento((Date) d);//error
		
		//Hasta aqui creamos una persona vieja como se hacia antes
		// veamos como funciona el patron Adapter
		
		ViejaToNuevaPersona personaNueva= new ViejaToNuevaPersona(vieja);
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		personaNueva.setEdad(10);
		personaNueva.setNombre("Juan Fernandez");

	}

}
