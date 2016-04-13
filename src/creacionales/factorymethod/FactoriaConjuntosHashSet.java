package creacionales.factorymethod;

public class FactoriaConjuntosHashSet<T> implements FactoriaConjuntos<T> {

	public Conjunto<T> creaConjunto() {
		return new ConjuntoHashSet<T>();
	}

}
