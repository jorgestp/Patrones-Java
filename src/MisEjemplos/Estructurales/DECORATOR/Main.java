package MisEjemplos.Estructurales.DECORATOR;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vendible auto=new FiatUno();
		
		auto=new MP3player(auto);
		
		auto= new Gasoil(auto);
		
		System.out.println(auto.getDescription());
		System.out.println("El precio es de: " + auto.getPrecio());
	}

}
