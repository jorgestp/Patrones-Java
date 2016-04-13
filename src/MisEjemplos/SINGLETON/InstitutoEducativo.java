package MisEjemplos.SINGLETON;

public class InstitutoEducativo {
	
	private static InstitutoEducativo instance;
	
	//Se coloca una variable del mismo tipo que la clase, y por convencion, 
	//se usa el nombre instance. Aqui reside  todo el secreto del patron, ya
	// que es la variable la que se instancia una unica vez y es esa la que se devuelve
	
	private InstitutoEducativo(){
		
		//Se privatiza el constructor para que no se tenga acceso desde new InstitutoEducativo
		
	}
	
	public static InstitutoEducativo getInstance(){
		
		if(instance == null){
			
			return new InstitutoEducativo();
		}
		
		return instance;
	}

}
