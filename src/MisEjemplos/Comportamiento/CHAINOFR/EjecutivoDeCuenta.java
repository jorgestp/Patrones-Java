package MisEjemplos.Comportamiento.CHAINOFR;

public class EjecutivoDeCuenta implements IAprobador {

	private IAprobador iaprobador;
	@Override
	public void solicitudPrestamo(int prestamo) {
		
		if(prestamo <= 10000){
			
			System.out.println("El prestamo lo manejo yo, el Ejecutivo de Cuenta");
			
		}else{
			
			iaprobador.solicitudPrestamo(prestamo);
		}
	}

	@Override
	public void setNext(IAprobador iaprobador) {

		this.iaprobador = iaprobador;
	}

	@Override
	public IAprobador getNext() {
		
		
		return iaprobador;
	}

}
