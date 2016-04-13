package creacionales.factorymethod;

public interface Conjunto<T> {
	void a�ade(T elem);

	int size();

	boolean contiene(T elem);

	void elimina(T elem);
}
