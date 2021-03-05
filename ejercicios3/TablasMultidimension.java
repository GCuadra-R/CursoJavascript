package ejercicios3;

public class TablasMultidimension {

	public void multis() {
		int[][] lista = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				lista[i][j] = i + j;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(lista[i][j]);
			}
			System.out.println("\n");
		}
	}

}
