package MisEjemplos.Estructurales.PROXY;

import java.util.ArrayList;

public class GuardarDatos implements IGuardar {

	@Override
	public void save(ArrayList guardarDatos) {

		if(ConectionManager.hayConection){
			
			new GuardarRemoto().save(guardarDatos);
		}else{
			
			new GuardarDiscoDuro().save(guardarDatos);
		}
		
	}

}
