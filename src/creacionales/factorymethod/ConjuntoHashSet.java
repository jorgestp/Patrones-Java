package creacionales.factorymethod;

import java.util.HashSet;

public class ConjuntoHashSet<T> implements Conjunto<T> {
	private HashSet<T> elementos;

	public ConjuntoHashSet() {
		elementos = new HashSet<T>();
	}

	@Override
	public void añade(T elem) {
		elementos.add(elem);
	}

	@Override
	public int size() {
		return elementos.size();
	}

	@Override
	public boolean contiene(T elem) {
		return elementos.contains(elem);
	}

	@Override
	public void elimina(T elem) {
		elementos.remove(elem);
	}
}
