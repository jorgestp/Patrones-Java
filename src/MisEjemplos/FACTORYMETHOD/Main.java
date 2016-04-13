package MisEjemplos.FACTORYMETHOD;

public class Main {
	
	public static void main(String[] arg){
		
		TrianguloFactoryMethod factoria=new TrianguloFactory();
		Triangulo triangulo=factoria.createTriangulo(10, 10, 10);
		
		System.out.println(triangulo.getdesciption());
	}

}
