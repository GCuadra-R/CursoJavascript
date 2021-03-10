package interfaces;

public interface Vehiculo {

	String frenar(int velocidad);
	String acelerar();
	double calcularPrecio(int pvp9);
	
	int velocidad_maxima=20;
	int velocidad=14;
}
