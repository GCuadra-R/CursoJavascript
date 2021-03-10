package interfaces;

public interface Vehiculo {

	int velocidad_maxima=120;
	
	//Declarar metodos
	String frenar(int velocidad);
	String acelerar(int velocidad);
	double calcularPrecio(int pvp);
	
}
