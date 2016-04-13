package creacionales.factorymethod;

public class Cliente2 {

	public static void main(String[] args) {
		// Un único punto de acoplamiento:
		FactoriaConjuntos<String> factoria = new FactoriaConjuntosHashSet<String>();

		// A partir de aquí, todo el código es independiente del tipo
		// concreto de conjunto utilizado.
		Conjunto<String> c1 = factoria.creaConjunto();

		c1.a�ade("Hola");
		c1.a�ade("Que tal");

		Conjunto<String> c2 = factoria.creaConjunto();
		// ...

	}

}
