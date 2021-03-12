package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero:");
		String fichero = teclado.next();
		String linea;
		int contador=0;
		
		// Abrir fichero para lectura
		try {
			FileWriter fw = new FileWriter(fichero);
			PrintWriter pw1 = new PrintWriter(fichero);
			boolean salir = true;
			
			do {
				System.out.println("Introduce una linea: ");
				linea = teclado.next();
				if(linea !=null) {salir=false;}
				else 				
				if (linea.length() < 4) {

				} else {
					pw1.println(linea);
					contador=contador+1;
					pw1.close();
				}
			} while (salir);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No puedo abrir el fichero para escribir, intentalo de nuevo");
		}
		System.out.println("Fichero cerrado");
		System.out.println("Has grabado "+contador+" lineas.");
	teclado.close();	
	}}

	


