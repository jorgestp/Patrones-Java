package MisEjemplos.Comportamiento.CHAINOFR;

public class LiderEjecutivo implements IAprobador {

	private IAprobador iaporbador;
	
	public void solicitudPrestamo(int prestamo) {
		
		if(prestamo > 10000  && prestamo <= 50000){
			
			System.out.println("El prestamo lo manejo yo, el Lider Ejecutivo");
		}else{
			
			iaporbador.solicitudPrestamo(prestamo);
		}

	}

	@Override
	public void setNext(IAprobador iaprobador) {
		
		this.iaporbador = iaprobador; 
	}

	@Override
	public IAprobador getNext() {
	
			return iaporbador;
		
	}

}
