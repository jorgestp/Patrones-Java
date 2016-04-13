package creacionales.factorymethod;

public interface Conjunto<T> {
	void añade(T elem);

	int size();

	boolean contiene(T elem);

	void elimina(T elem);
}
