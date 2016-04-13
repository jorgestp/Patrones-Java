package creacionales.builder;

// Construye naves completas, con todos los componentes
public class NaveCompletaDirector {
	private NaveBuilder builder;

	public NaveCompletaDirector(NaveBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildImagen();
		builder.buildArmamento();
		builder.buildPropulsor();
	}

}
