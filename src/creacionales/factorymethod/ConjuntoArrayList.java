package creacionales.factorymethod;

import java.util.ArrayList;

public class ConjuntoArrayList<T> implements Conjunto<T> {
	private ArrayList<T> elementos;

	public ConjuntoArrayList() {
		elementos = new ArrayList<T>();
	}

	@Override
	public void añade(T elem) {
		if (!elementos.contains(elem))
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
