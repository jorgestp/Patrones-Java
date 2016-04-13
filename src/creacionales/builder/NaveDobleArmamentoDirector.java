package creacionales.builder;

// Construye naves completas, con todos los componentes
public class NaveDobleArmamentoDirector {
	private NaveBuilder builder;

	public NaveDobleArmamentoDirector(NaveBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildImagen();
		builder.buildArmamento();
		builder.buildArmamento();
		builder.buildPropulsor();
	}

}
