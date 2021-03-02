package clases;

public class Principal {

	String nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1= new Persona();
		p1.mostrar();
		
		Persona s1=new Persona();
		System.out.println(s1.saludar("Hola"));
		
		
		//Probando clase vehiculo
Vehiculo v1=new Vehiculo();
v1.setRuedas(4);
v1.setCv(100);
System.out.println(v1.getRuedas());
System.out.println(v1.getCv());

v1.setTipo(2);
v1.setPvp(1000);
System.out.println(v1.Precio());

Utilidades ut1=new Utilidades();
System.out.println(ut1.nPrimos(7));
System.out.println(ut1.parImpar(8));

System.out.println(ut1.nPrimos(v1.Precio()));
System.out.println(ut1.parImpar(v1.Precio()));
		
	}
	
		

}
