package figuras;

import java.util.Scanner;

public class AdivinaNumero implements Juego, Ficheros {
	private int numero = 0;
	private int num_tiradas = 0;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		this.setNumero((int) (Math.random() * 100) + 1);
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		int n1 = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			num_tiradas=num_tiradas+1;
			System.out.println("Introduce un numero:");
			n1 = teclado.nextInt();
			if (numero > n1) {
				System.out.println("El numero que buscas es mayor.");
			} else if(numero < n1){
				System.out.println("El numero que buscas es menor.");
			} else {
				System.out.println("Lo encontraste!");
			}

		} while (n1 != getNumero());

	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		System.out.println("Encontrastes "+numero+" despues de "+num_tiradas+" tiradas");
	}

	@Override
	public void escribirResultados() {
		// TODO Auto-generated method stub
		
	}

}
