package MisEjemplos.Estructurales.BRIDGE;

public class Rectangulo extends Forma{

	private double x, y, w, z;
	
	public Rectangulo(Dibujo dibujo,double x, double y, double w, double z) {
		super(dibujo);
		this.x=x;
		this.y=y;
		this.w=w;
		this.z=z;
	}

	@Override
	public void dibuja() {

		dibujaRectangulo(x, y, w, z);
	}
	
	

}
