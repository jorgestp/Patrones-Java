package MisEjemplos.Estructurales.PROXY;

import java.util.ArrayList;

public class GuardarRemoto implements IGuardar {

	@Override
	public void save(ArrayList guardarDatos) {
		System.out.println("Guardar en remoto..");		
	}

}
