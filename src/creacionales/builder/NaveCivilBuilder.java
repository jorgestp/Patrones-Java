package creacionales.builder;

public class NaveCivilBuilder extends NaveBuilder {
	private Nave nave;

	public NaveCivilBuilder() {
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
	}

	public void buildPropulsor() {
		nave.setPropulsor(new PropulsorQuimico());
	}

}
