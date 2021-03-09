package herencia2;

public class Gato extends Animal{

	private boolean castrado;
	private char sexo;
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	@Override
	public String sonido(){
		return "Miau";	
	}
	
	
	
}
