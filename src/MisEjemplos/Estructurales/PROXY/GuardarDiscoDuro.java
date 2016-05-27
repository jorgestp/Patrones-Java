package MisEjemplos.Estructurales.PROXY;

import java.util.ArrayList;

public class GuardarDiscoDuro implements IGuardar {

	@Override
	public void save(ArrayList guardarDatos) {
		System.out.println("Guardando datos en el HD");

	}
	
	

}
