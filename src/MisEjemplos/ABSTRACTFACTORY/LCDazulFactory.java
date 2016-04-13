package MisEjemplos.ABSTRACTFACTORY;

public class LCDazulFactory extends AbstractFactory {

	@Override
	public TV createTV() {
		
		return new LCD();
	}

	@Override
	public Color createColor() {
		
		return new Azul();
	}

}
