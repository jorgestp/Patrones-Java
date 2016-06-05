package MisEjemplos.Comportamiento.CHAINOFR;

public interface IAprobador {

	public void solicitudPrestamo(int prestamo);
	
	public void setNext(IAprobador iaprobador);
	
	public IAprobador getNext();
}


