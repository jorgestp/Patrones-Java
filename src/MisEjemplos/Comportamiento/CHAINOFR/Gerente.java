package MisEjemplos.Comportamiento.CHAINOFR;

public class Gerente implements IAprobador {
	
	
	private IAprobador iaporbador;
	
	public void solicitudPrestamo(int prestamo) {
		
		if(prestamo > 50000  && prestamo <= 100000){
			
			System.out.println("El prestamo lo manejo yo, el Gerente");
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
