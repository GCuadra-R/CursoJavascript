package bucles;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		int n1;
		n1 = numero.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Numero No Primo");
		} else {
			// Contador
			int x = 2;
			// Switch
			boolean primo = true;

			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					System.out.println("Numero No Primo");
					System.out.println("Divisible por:" + x);
					primo = false;
					break;
				}
				x++;
			}
			if (primo) {
				System.out.println("Numero Primo");
			} 
		numero.close();
		}
	}
}
