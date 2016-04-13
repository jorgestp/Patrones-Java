package creacionales.builder;

public class NaveRebeldeBuilder extends NaveBuilder {
	private Nave nave;

	public NaveRebeldeBuilder() {
		nave = new Nave();
	}

	// getResult()
	public Nave getNave() {
		return nave;
	}

	public void buildImagen() {
		nave.setImagen(new Bitmap("naveRebeldeIcon.bmp"));
	}

	public void buildArmamento() {
		nave.addArma(new RayoNeutrones());
		nave.addArma(new BombaH());
	}

	public void buildPropulsor() {
		nave.setPropulsor(new PropulsorQuimico());
	}

}
