package herencia2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1=new Animal();
		animal1.setPatas(4);
		animal1.setColor("Blanco");
		System.out.println(animal1.sonido());
		System.out.println(animal1);
		
		Gato gato1=new Gato();
		System.out.println(gato1.sonido());
		System.out.println(gato1.chip());
		
//Creacion de objeto de clase perro
		Perro perro1=new Perro();
		System.out.println(perro1.sonido());
		System.out.println(perro1.chip());
		
//Creando un objeto de clase Hamster
		Hamster ham1=new Hamster();
		System.out.println(ham1.sonido());
		System.out.println(ham1.chip());

//Creando un objeto de clase Rapaces
		Rapaces rap1=new Rapaces();
		System.out.println(rap1.sonido());
		System.out.println(rap1.chip());
		System.out.println(rap1.vuela);
		
//Creando un objeto de clase Hamster
		Periquitos peri1=new Periquitos();
		System.out.println(peri1.sonido());
		System.out.println(peri1.chip());
		System.out.println(peri1.getColor());	
	}

}
