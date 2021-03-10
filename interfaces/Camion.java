package interfaces;

public class Camion implements Vehiculo {

	private int peso;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		double metros = (velocidad * velocidad) / 180+((this.getPeso()/100)*2);
		// return Double.toString(metros);
		return "Tardas en frenar " + metros + " metros.";
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		String marcha= " ";
		if(velocidad>8 && velocidad<=20)marcha="primera";
		//incluir otras marchas por velocidad
		if (velocidad > velocidad_maxima) {
			return "Vas a " + velocidad + "kilometros por hora, y por encima de la permitida, que es "
					+ velocidad_maxima;
		}
		else {
			return "Vas a "+velocidad+" kilometros por hora";
			
		}
	}

	@Override
	public double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return 0;
	}



}
