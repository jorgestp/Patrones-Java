package estructurales.decorator;

public interface TextInterfaceFactory {
	GreetingsMessenger createGreetingsMessenger();

	DataReader createDataReader();

	// ... aquí vendrán el resto de métodos creacionales para el resto de tipos
	// de componentes involucrados en la interfaz textual
}
