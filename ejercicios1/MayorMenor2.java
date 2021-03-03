package ejercicios1;

import java.util.Scanner;

public class MayorMenor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dime un numero: ");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		System.out.println("Dime un numero diferente: ");
		Scanner entrada2 = new Scanner(System.in);
		int num2 = entrada2.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + ", " + num2);
		}
		{
			System.out.println(num2 + ", " + num1);

		}
		entrada.close();
		entrada2.close();
	}

}
