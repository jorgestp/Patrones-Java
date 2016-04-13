package MisEjemplos.BUILDER;

public abstract class AutoBuilder {
	
	protected Auto auto;
	
	public Auto getAuto(){
		
		return auto;
		
	}
	
	public void CrearAuto(){
		
		auto=new Auto();
		
		
	}
	
	public abstract void buildMotor();
	public abstract void buildPuertas();
	public abstract void buildModelo();
	public abstract void buildMarca();

}
