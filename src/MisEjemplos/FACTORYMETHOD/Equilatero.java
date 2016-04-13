package MisEjemplos.FACTORYMETHOD;

public class Equilatero extends Triangulo {

	public Equilatero(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	
	}

	@Override
	public String getdesciption() {
	
		return "Soy un triangulo Equilatero";
	}

	@Override
	public double getSuperficie() {
		
		return 0;
	}

	@Override
	public void dibujate() {
		
		
	}

}
