package MisEjemplos.PROTOTYPE;

public class PLASMA extends TV {
	
	private double anguloVision, tiempoRespuesta;

	public double getAnguloVision() {
		return anguloVision;
	}

	public void setAnguloVision(double anguloVision) {
		this.anguloVision = anguloVision;
	}

	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

	public PLASMA(String marca, String color, int pulgadas, double precio, double angulo, double tiempo) {
		super(marca, color, pulgadas, precio);
	
		anguloVision=angulo;
		tiempoRespuesta=tiempo;
	}

}
