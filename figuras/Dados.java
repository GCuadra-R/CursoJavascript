package figuras;

import java.util.Scanner;

public class Dados implements Juego, Ficheros{

	private String jugador1;
	private String jugador2;
	private int tirada_jugador1;
	private int tirada_jugador2;
	
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca primer jugador:");
		setJugador1(teclado.next());
		System.out.println("Introduzca segundo jugador:");
		setJugador2(teclado.next());
		System.out.println("Jugadores: "+getJugador1()+" y " + getJugador2()+". Todo listo para jugar!");
	}

	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		tirada_jugador1=(int) (Math.random()*6+1);
		tirada_jugador2=(int) (Math.random()*6+1);
		System.out.println(getJugador1()+" ha sacado un "+tirada_jugador1);
		System.out.println(getJugador2()+" ha sacado un "+tirada_jugador2);
	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		if(tirada_jugador1>tirada_jugador2) {
			System.out.println("Ha ganado "+getJugador1());
		}
		if(tirada_jugador1<tirada_jugador2) {
			System.out.println("Ha ganado "+getJugador2());
		}
		if(tirada_jugador1==tirada_jugador2) {
			System.out.println(getJugador1()+" y "+getJugador2()+" han quedado empatados!");
		}
		
		}

	@Override
	public void escribirResultados() {
		// TODO Auto-generated method stub
		
	}
}
