package abstractas;

public class Caza extends Avion {

	private String modelo;
	private int num_misiles;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNum_misiles() {
		return num_misiles;
	}
	public void setNum_misiles(int num_misiles) {
		this.num_misiles = num_misiles;
	}
	
	public String disparar(int misiles) {
		return "Disparando "+misiles+" misiles.";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Es caza modelo "+getModelo()+", con una potencia de fuego de "+getNum_misiles();
		}
	@Override
	public boolean equals(Object obj) {
		// Convertir obj a Caza
		Caza caza2=(Caza) obj;
		
		if (this.getPotencia()== caza2.getPotencia()) {
			return true; 
		}
		else
		{
			return false;
		}
	}

	}

