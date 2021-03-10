package interfaces;

public class Coche implements Vehiculo {

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "Distancia de frenado: "+((velocidad*velocidad)/180);
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "Acelerar con coche";
	}

	@Override
	public double calcularPrecio(int pvp9) {
		// TODO Auto-generated method stub
		return (pvp9+(pvp9*0.21));
	}

}
