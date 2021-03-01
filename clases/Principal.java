package clases;

public class Principal {

	String nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1= new Persona();
		p1.mostrar();
		
		Persona s1=new Persona();
		System.out.println(s1.saludar("Hola"));
		
	}

}
