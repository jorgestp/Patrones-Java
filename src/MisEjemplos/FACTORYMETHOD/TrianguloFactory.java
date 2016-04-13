package MisEjemplos.FACTORYMETHOD;

public class TrianguloFactory implements TrianguloFactoryMethod {

	@Override
	public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC){
		
		if (ladoA==ladoB && ladoA==ladoC){
			
			return new Equilatero(ladoA,ladoB,ladoC);
		}
		else if(ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC){
			
			return new Escaleno(ladoA, ladoB, ladoC);
		}else{
			return new Isosceles(ladoA,ladoB,ladoC);
		}
		
	}

}
