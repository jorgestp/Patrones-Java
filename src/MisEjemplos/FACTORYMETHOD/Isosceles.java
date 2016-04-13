package MisEjemplos.FACTORYMETHOD;

public class Isosceles extends Triangulo {

	public Isosceles(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	
	}

	@Override
	public String getdesciption() {
		
		return "Soy un triangulo Isosceles";
	}

	@Override
	public double getSuperficie() {

		return 0;
	}

	@Override
	public void dibujate() {

		
	}

}
