package abstractas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Una clase abstracta no genera objetos:
 * Avion avion1=new Caza(); generara un error	
 */
		Caza caza1=new Caza();
		caza1.setModelo("F-18 Hornet");
		caza1.setNum_misiles(2);
		caza1.setPotencia(1000);
		
	System.out.println(caza1);
	
	//Objeto de la clase AvionPasajeros
	AvionPasajeros avion1=new AvionPasajeros();
	avion1.setModelo("Airbus A.380");
	avion1.setNum_pasajeros(1000);
	avion1.setTonelaje(90000);
	
	System.out.println(avion1);
	System.out.println(avion1.beneficio(10));
	
	Caza caza2=new Caza();
	caza2.setPotencia(1000);
	if (caza1.getPotencia()==caza2.getPotencia()) {
		System.out.println("Son iguales");
	}
	else
	{
		System.out.println("No son iguales");
	}
		
	if (caza1.equals(caza2)) {
		System.out.println("Son iguales");
	}
	else
	{
		System.out.println("No son iguales");
	}
	

	AvionPasajeros avion2=new AvionPasajeros();
	if(avion1.equals(avion2)) {
		System.out.println("Son iguales");
	}
	else
	{
		System.out.println("No son iguales");
	}
	
}
	}
