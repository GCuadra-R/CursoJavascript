package metodos;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=m1();
System.out.println(x);
m2();
System.out.println(nombre());
System.out.println(sumar(10,34));
System.out.println(inicial("ejemplo"));
String dato="prueba";
System.out.println(dato);

	}
	
	
public static int m1()
{
	return 1;
}

public static void m2()
{
	System.out.println("Esto es un metodo void");
}

public static String nombre()
{
	return	"Gilberto";
}

public static int sumar(int num1, int num2)
{
	return num1+num2;		
}

public static char inicial(String cadena)
{
	String mayus=cadena.toUpperCase();
	return mayus.charAt(0);
}


}
