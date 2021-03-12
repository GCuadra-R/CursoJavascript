package excepciones;

public class DivisionPorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int resultado = 0;
		
		try {
			resultado = x / 0;
		} catch (Exception mio) {
			// TODO Auto-generated catch block
			System.out.println("Has dividido por Cero");
		}
		
		System.out.println(resultado);

	}

}
