package ejercicios;

public class Asteriscos_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= new int[10];
		
		for (int contador=0; contador < array1.length; contador++) 
		{
			//Posicion del array le asocia un aleatorio
			array1[contador] = (int) (Math.random() * 10) + 1;  
		}
		for (int contador=0; contador < array1.length; contador++) 
		{
			System.out.println("Numero: "+array1[contador]+"-<");
			
		
			//Por cada numero del array
			for(int asteriscos=0; asteriscos<=array1[contador]; contador++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
