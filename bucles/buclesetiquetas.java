package bucles;

public class buclesetiquetas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		
		//bucle principal
principal:		while(b) {
			System.out.println("Estoy en el bucle principal");
			
		//bucle secundario	
			secundario:	for(int x=0; x<=10;x++) {
				System.out.println("Estoy en el bucle secundario"+x);
				if(x==5)break principal;
			}
		}
		
		
		
	}

}
