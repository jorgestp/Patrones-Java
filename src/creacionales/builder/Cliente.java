package creacionales.builder;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Se decide el builder a utilizar, lo que determinar� el producto a
		// obtener
		NaveRebeldeBuilder builder = new NaveRebeldeBuilder();

		// Se decide el director a utilizar, lo que determinar� el proceso
		// de construcci�n del producto
		NaveCompletaDirector director = new NaveCompletaDirector(builder);

		// Se ordena al director que construya el producto compuesto
		director.construct();

		// Se le pide al builder que nos devuelva el resultado de la
		// construcci�n
		Nave resultado = builder.getNave();

	}

}
