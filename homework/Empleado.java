package homework;

public class Empleado {

	private String nombre;

	//Constructor por defecto
	Empleado(){}
	
	//Constructor con parametros
	public Empleado(String nombre){
		super();
		this.setNombre(nombre);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado: "+getNombre();
	}
	
}
