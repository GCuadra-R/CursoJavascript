package abstractas;

public class AvionPasajeros extends Avion {

	//Atributos
	private int num_pasajeros;
	private int num_pilotos;
	
	//Generando Getters y Setters
	public int getNum_pasajeros() {
		return num_pasajeros;
	}
	public void setNum_pasajeros(int num_pasajeros) {
		this.num_pasajeros = num_pasajeros;
	}
	public int getNum_pilotos() {
		return num_pilotos;
	}
	public void setNum_pilotos(int num_pilotos) {
		this.num_pilotos = num_pilotos;
	}

	//Metodos
	public String repostar() {
		return "Reposto en el aeropuerto y en la base";
	}
	
	public double beneficio(double pvp_billete) {
		return (pvp_billete*num_pasajeros);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es un avion "+getModelo()+" con un numero de pasajeros de "+getNum_pasajeros();
	}
	
	@Override
	public boolean equals(Object obj) {
		// Convertimos obj a AvionPasajeros
		AvionPasajeros Comparado = (AvionPasajeros) obj;

		if (this.getNum_pasajeros() == Comparado.getNum_pasajeros() && this.getModelo() == Comparado.getModelo()) {
			return true;
		} else {
			return false;
		}
	}

}
