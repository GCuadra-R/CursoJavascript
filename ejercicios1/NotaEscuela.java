package ejercicios1;

import java.util.Scanner;

public class NotaEscuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que nota sacaste en el examen?");
		int n1 = scan.nextInt();
		if (n1 >= 0 || n1 <= 10) {
			switch (n1) {

			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Esta nota es Insuficiente");
				break;
			case 5:
			case 6:
				System.out.println("Esta nota es Suficiente");
				break;
			case 7:
			case 8:
				System.out.println("Esta nota es Notable");
				break;
			case 9:
			case 10:
				System.out.println("Esta nota es Sobresaliente");
				break;
			default:
				System.out.println("Tienes que darme una nota real");
			}
		} else
			System.out.println("Tienes que darme una nota real");

		scan.close();
	}

}
