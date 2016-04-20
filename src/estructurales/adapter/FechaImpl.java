package estructurales.adapter;

public class FechaImpl implements Fecha {
	private int dia;
	private int mes;
	private int anyo;

	public FechaImpl(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

}
