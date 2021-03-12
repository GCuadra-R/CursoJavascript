package excepciones;

public class TryCatchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {1,4,3,6,9,343553};
		
			try {
				System.out.println(array1[3]);
				
			} catch (ArrayIndexOutOfBoundsException mi_error) {
				// TODO Auto-generated catch block
				System.out.println("No existe esa posicion");
			}
			catch (ArithmeticException e1)
			{
				System.out.println("Has dividido por CERO");
			}
			catch (Exception e2)
			{
				System.out.println("Error desconocido "+e2.getMessage());
			}
		
		
		
	}

}
