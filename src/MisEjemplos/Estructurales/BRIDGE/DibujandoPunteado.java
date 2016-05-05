package MisEjemplos.Estructurales.BRIDGE;

public class DibujandoPunteado extends Dibujo {

	@Override
	public void dibujaRectangulo(double x, double y, double w, double z) {

		System.out.println("Dibujando un rectangulo punteado");
	}

	@Override
	public void dibujaCirculo(double x, double y, double z) {


		System.out.println("Dibujando un circulo punteado");
	}

}
