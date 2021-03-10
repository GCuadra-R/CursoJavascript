package herencia2;

public class Periquitos extends Pajaro{

	private boolean canta;

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}
	
	@Override
	public String sonido(){
		return "Trururururu";	
	}
	
}
