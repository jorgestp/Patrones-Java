package MisEjemplos.Estructurales.BRIDGE;

public class Main {

	public static void main(String[] args) {

		
		Rectangulo rectangulo=new Rectangulo(new DibujandoPunteado(), 1, 2, 3, 4);
		
		rectangulo.dibuja();
		
		Circulo circulo=new Circulo(new DibujandoNormal(), 2, 5, 4);
		circulo.dibuja();
	}

}
