package ejercicios1;

import java.util.Scanner;

public class Fechas30Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dia:");
		int dia = entrada.nextInt();
		if(dia>31)
		{
			System.out.println("Ningun mes tiene mas de 31 dias");
			System.exit(10);
		}
		else
		System.out.println("Mes:");
		int mes = entrada.nextInt();
		if(mes<1 || mes>12)
		{
			System.out.println("Un año tiene 12 meses");
			System.exit(10);
		}
		else
		System.out.println("Año:");
		int año = entrada.nextInt();
				
//Febrero
		if (mes==2)
			{
				if(dia<1 || dia>28) 
				{
					System.out.println("Este mes tiene solo 28 dias");
				}
			}
		
//Meses de 30 dias
		if (mes==4 || mes==6 || mes==9 || mes==11)
			{
				if(dia>30)
				{System.out.println("Este mes tiene solo 30 dias");
			}
	
entrada.close();
}
}}