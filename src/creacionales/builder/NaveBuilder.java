package creacionales.builder;

// En este ejemplo, al devolver todos los ConcreteBuilders
// un objeto del mismo tipo, podr�amos implementar el 
// m�todo "getNave()" en el Builder abstracto.
// Por eso lo pongo como clase abstracta en lugar de
// interface, para que sea m�s flexible

// ¿Y si ponemos implementaciones por defecto de estos métodos?
public abstract class NaveBuilder {
	public void buildImagen() {
	}

	public void buildArmamento() {
	}

	public void buildPropulsor() {
	}
	
}
