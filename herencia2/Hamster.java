package herencia2;

public class Hamster extends Animal {

	private String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String sonido(){
		return "Ñiññiññiññi";}	
}
