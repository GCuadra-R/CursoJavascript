package ejercicios3;

public class PasarArrayMetodo {

	public static void main(String[] args) {
		
	}
	public int mayor(int numeros[]) {
		int mayor = 0;
		int len = numeros.length;
		for (int i = 0; i < len; i++) {

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}

		}

		return mayor;
	}

	
}
