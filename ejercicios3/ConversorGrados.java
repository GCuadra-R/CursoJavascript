package ejercicios3;

public class ConversorGrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temperatura=10;
		System.out.println(grados(temperatura));}
	
	public static double grados(double gradosf) {

		double gradosc = (gradosf - 32) * 5 / 9;

		return gradosc;
	}


		
	}

