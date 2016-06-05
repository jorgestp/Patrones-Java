package MisEjemplos.Comportamiento.CHAINOFR;

public class Banco implements IAprobador {

	private IAprobador next;
	@Override
	public void solicitudPrestamo(int prestamo) {
		
		EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
		
		this.setNext(ejecutivo);
		
		LiderEjecutivo lider = new LiderEjecutivo();
		
		ejecutivo.setNext(lider);
		
		Gerente gerente = new Gerente();
		
		lider.setNext(gerente);
		
		Director director = new Director();
		
		gerente.setNext(director);
		
		next.solicitudPrestamo(prestamo);

	}

	@Override
	public void setNext(IAprobador iaprobador) {

		next = iaprobador;
	}

	@Override
	public IAprobador getNext() {
		return next;
	}

}
