package ejercicios3;

public class Figura {

	private String nombre;
	private double lado1;
	private double lado2;
	private String tipo;
	
	Figura(double lado1, double lado2){
	    
        setLado1(lado1);
        setLado2(lado2);
    }
	
	public double area() {
		return (getLado1()*getLado2());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	
}
