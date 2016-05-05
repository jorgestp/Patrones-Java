package MisEjemplos.Estructurales.BRIDGE;

public class Circulo extends Forma {

	private double coordenadaX, coordenadaY, coordenadaZ;
	
	public Circulo(Dibujo dibujo, double coordenadaX, double coordenadaY, double coordenadaZ) {
		super(dibujo);
		this.coordenadaX=coordenadaX;
		this.coordenadaZ=coordenadaZ;
		this.coordenadaY=coordenadaY;
	}

	@Override
	public void dibuja() {
		
		dibujaCirculo(coordenadaX, coordenadaY, coordenadaZ);
	}
	
	

}
