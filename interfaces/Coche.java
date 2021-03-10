package interfaces;

public class Coche implements Vehiculo {

	@Override
	public double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (pvp + (pvp * 0.21));
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		double metros = (velocidad * velocidad) / 180;
		// return Double.toString(metros);
		return "Tardas en frenar " + metros + " metros.";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		if (velocidad > velocidad_maxima) {
			return "Vas a " + velocidad + "kilometros por hora, y por encima de la permitida, que es "
					+ velocidad_maxima;
		}
		else {
			return "Vas a "+velocidad+" kilometros por hora";
			
		}
	}

}
