package MisEjemplos.PROTOTYPE;

import java.util.HashMap;

public class TVprototype {

	private HashMap<String, TV> prototipos=new HashMap<String, TV>();
	
	public TVprototype() {
		
		PLASMA plasma=new PLASMA("Soby", "Plateado", 21, 399.99, 156, 0.02);
		LCD lcd=new LCD("Panasonic"	, "Negro", 42, 259.95, 180);
		
		
		// ACLARACION IMPORTANTE
		//Se ha hardcodeado dos tipos de tvs para su facil visualizacion.
		//Lo ideal seria crear dos metodos para agregar/eliminar prototipos dinamicamente del Map.
		
		prototipos.put("Plasma", plasma);
		prototipos.put("LDC", lcd);
		
	}
	
	public Object prototipo(String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).Clone();
		
		
	}
	
	
		
		
	
}
