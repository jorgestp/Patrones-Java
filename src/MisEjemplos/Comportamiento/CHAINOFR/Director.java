package MisEjemplos.Comportamiento.CHAINOFR;

public class Director implements IAprobador {
	
	private IAprobador iaporbador;
	
	public void solicitudPrestamo(int prestamo) {
		
		if(prestamo > 100000){
			
			System.out.println("El prestamo lo manejo yo, el DIRECTOR");
	
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
