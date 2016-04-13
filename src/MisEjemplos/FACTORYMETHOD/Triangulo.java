package MisEjemplos.FACTORYMETHOD;

public abstract class Triangulo {
	
	private int ladoA, ladoB, ladoC; //con sus gets y sets
	
	public Triangulo( int ladoA, int ladoB, int ladoC){
		
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
		
	}
	
	public abstract String getdesciption();
	
	public abstract double getSuperficie();
	
	public abstract void dibujate();
	

}
