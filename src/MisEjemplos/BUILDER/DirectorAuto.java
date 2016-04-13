package MisEjemplos.BUILDER;

public class DirectorAuto {
	
	private AutoBuilder autobuilder;
	
	public void Construct(){
		autobuilder.CrearAuto();
		autobuilder.buildMarca();
		autobuilder.buildModelo();
		autobuilder.buildMotor();
		autobuilder.buildPuertas();
	}
	
	public void setAutobuilder( AutoBuilder ab){
		
		autobuilder=ab;
	}
	
	public Auto getAuto(){
		
		return new Auto();
	}

}
