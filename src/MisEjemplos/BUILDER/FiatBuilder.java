package MisEjemplos.BUILDER;

public class FiatBuilder extends AutoBuilder {

	@Override
	public void buildMotor() {
		Motor motor=new Motor();
		motor.setNumero(33252);
		motor.setPotencia("1.6");
		auto.setMotor(motor);
		
	}

	@Override
	public void buildPuertas() {
		
		auto.setCantidadDePuertas(5);
	}

	@Override
	public void buildModelo() {
		auto.setModelo("bravo");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("FIAT");
		
	}

}
