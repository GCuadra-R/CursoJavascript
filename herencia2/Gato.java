package herencia2;

public class Gato extends Animal{

	private boolean ronronea;
	
	public boolean isRonronea() {
		return ronronea;
	}

	public void setRonronea(boolean ronronea) {
		this.ronronea = ronronea;
	}

	@Override
	public String sonido(){
		return "Miau";	
	}
	

	
	
	
}
