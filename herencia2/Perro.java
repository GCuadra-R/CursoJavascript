package herencia2;

public class Perro extends Animal{

	
	public boolean peligroso;
	
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	@Override
	public String sonido(){
		return "Guauu!";	
	}
	
	
}
