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
System.out.println(inicial(dato));
System.out.println(iniciales("gilberto","cuadra","hernandez"));
System.out.println(numeroPrimo(7));
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

public static String iniciales(String n, String ap1, String ap2) 
{
	return n.toUpperCase().charAt(0) + ". " + ap1.toUpperCase().charAt(0) + ". " + ap2.toUpperCase().charAt(0);
}

public static String numeroPrimo(double n1) 
{
	//Comprobar que es divisible por dos
	if (n1 % 2 == 0) {
		return "Numero No Primo";
} 
	else 
{
		// Contador
		int x = 2;
		
		// Comprobar si es primo
		while (x < n1) {
			if (n1 % x == 0) {
				// System.out.println("Divisible por:" + x);
							return "Numero No Primo";
			}
			x++;
		}			
			return "Numero Primo";
	}
}}
