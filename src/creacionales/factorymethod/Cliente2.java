package creacionales.factorymethod;

public class Cliente2 {

	public static void main(String[] args) {
		// Un Ãºnico punto de acoplamiento:
		FactoriaConjuntos<String> factoria = new FactoriaConjuntosHashSet<String>();

		// A partir de aquÃ­, todo el cÃ³digo es independiente del tipo
		// concreto de conjunto utilizado.
		Conjunto<String> c1 = factoria.creaConjunto();

		c1.añade("Hola");
		c1.añade("Que tal");

		Conjunto<String> c2 = factoria.creaConjunto();
		// ...

	}

}
