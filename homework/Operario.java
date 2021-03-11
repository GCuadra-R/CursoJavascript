package homework;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super (nombre);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" --> Operario";
	}

}
