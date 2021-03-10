package abstractas;

public abstract class Avion {
	private double tonelaje;
	private int potencia;
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTonelaje() {
		return tonelaje;
	}
	public void setTonelaje(double tonelaje) {
		this.tonelaje = tonelaje;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

public String despegar() {
	return "Estoy despegando";
}

public String aterrizar() {
	return "Estoy aterrizando";
}

public String repostar() {
	return null;
}

}
