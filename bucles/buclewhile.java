package bucles;


import java.util.Scanner;

public class buclewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Pedir dos nemeros por teclado y visualizar los numeros entre ellos	
Scanner numero= new Scanner(System.in);	
int n1;
int n2;
n1=numero.nextInt();	
n2=numero.nextInt();

while( n1<=n2) {
	System.out.print(n1+"-");
	n1++;
}
numero.close();
	}}