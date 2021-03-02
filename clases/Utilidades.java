package clases;

public class Utilidades {

	
	public boolean nPrimos(double n1)
	{
		if (n1 % 2 == 0) {
			return false;
	} 
		else 
	{
			// Contador
			int x = 2;
			
			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					// System.out.println("Divisible por:" + x);
								return false;
				}
				x++;
			}			
				return true;
		}
	}

	public boolean parImpar(double n1)
	{
		if(n1 % 2 ==0)
		{return true;}
		else
		{return false;}
	}
	
	
	
}
