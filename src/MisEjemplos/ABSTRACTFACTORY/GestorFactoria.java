package MisEjemplos.ABSTRACTFACTORY;

public class GestorFactoria {

	public GestorFactoria(AbstractFactory factory){
		
		Color color=factory.createColor();
		TV tv = factory.createTV();
		color.colorea(tv);
	}
	
	public static void main(String [] arg){
		
		AbstractFactory a=new PlasmaAmarilloFACTORY();
		
		AbstractFactory b= new LCDazulFactory();
		GestorFactoria gestor1=new GestorFactoria(b);
		
		
	}
}
