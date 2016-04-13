package creacionales.factorymethod;

public class Cliente {

	public static void main(String[] args) {

		Conjunto<String> c1 = new ConjuntoArrayList<String>();

		c1.añade("Hola");
		c1.añade("Que tal");

		Conjunto<String> c2 = new ConjuntoArrayList<String>();
		// ...

	}

	public static void metodoExtrao(Conjunto<String> c) {

	}

}
