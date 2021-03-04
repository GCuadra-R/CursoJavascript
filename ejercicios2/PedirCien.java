package ejercicios2;

public class PedirCien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rand = 0;
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			rand = rand + n;
			System.out.print(n + " ");
		}
		System.out.print("\n");

		
	}

}
