package creacionales.builder;

import java.util.ArrayList;
import java.util.List;

// En este ejemplo, tenemos un �nico producto.
// Podr�amos tener distintas naves, cada una con su propia
// interfaz, aunque todas ellas con un conjunto igual de 
// componentes que hay que inicializar
public class Nave {
	private Bitmap imagen;
	private List<Arma> armamento;
	private Propulsor propulsor;

	public Nave() {
		armamento = new ArrayList<Arma>();
	}

	// El producto tiene que permitir inicializar las propiedades
	// por separado
	public void setImagen(Bitmap imagen) {
		this.imagen = imagen;
	}

	public void setArmamento(List<Arma> armamento) {
		this.armamento = armamento;
	}

	public void addArma(Arma a) {
		this.armamento.add(a);
	}

	public void setPropulsor(Propulsor propulsor) {
		this.propulsor = propulsor;
	}

	public void setVelocidadDeLaLuz() {
		// ...
	}

	// ... resto de la funcionalidad...
}
