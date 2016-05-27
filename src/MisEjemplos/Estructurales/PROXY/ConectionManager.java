package MisEjemplos.Estructurales.PROXY;

public class ConectionManager {

	public static boolean hayConection;
	
	public ConectionManager(){
		hayConection = false;
	}
	
	public static void conectate(){
		
		hayConection = true;
		
	}
	
	
	public void desconectate(){
		
		hayConection = false;
	}
	
	public boolean hayConexion(){
		
		return hayConection;
	}
}

