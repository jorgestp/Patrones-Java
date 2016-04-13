package MisEjemplos.ABSTRACTFACTORY;

public class PlasmaAmarilloFACTORY extends AbstractFactory {

	@Override
	public TV createTV() {
	
		return new Plasma();
	}

	@Override
	public Color createColor() {

		return new Amarillo();
	}

}
