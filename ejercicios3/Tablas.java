package ejercicios3;

public class Tablas {

	public String saludar(String nombre) {
		return "Hola te llamas " + nombre;
	}

	public void numedia() {
		double[] array1 = new double[5];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (Math.random() * -100) + 50;

			System.out.print(array1[i] + " ");
		}
		// comprobar par -impar -ceros
		int ceros = 0, positivos = 0, negativos = 0;
		double sum_positivos = 0, sum_negativos = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros = ceros++;
			} else {
				if (array1[i] > 0) {
					sum_positivos = sum_positivos + array1[i];
					positivos = ++positivos;
				} else {
					negativos = ++negativos;
					sum_negativos = sum_negativos + array1[i];
				}
			}
			System.out.println("la media de los positivos es " + (sum_positivos / positivos)
					+ " y la de los negativos es " + (sum_negativos / negativos));
			System.out.println("y el numero de ceros es "+ceros);
		}

	}
}
