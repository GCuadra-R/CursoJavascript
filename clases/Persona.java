package clases;

public class Persona {

	public void mostrar()
	{
		System.out.println("Estoy en una instancia de la clase Persona");
	}
	
	private void metodo_privado()
	{
		System.out.println("Estoy en un metodo privado");
	}
	
	public String saludar(String nombre)
	{
		return nombre.toUpperCase();
	}
}
