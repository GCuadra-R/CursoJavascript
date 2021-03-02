package clases;

public class Vehiculo {
	private int tipo=0;
	private int ruedas;
	private String bastidor;
	private int cv;
	private double pvp;

//Constructor para inicializar propiedades
	Vehiculo()
	{
		this.ruedas=4;
		tipo=0;
		pvp=0;
		cv=0;
		bastidor="Sin bastidor";
	}
	
	Vehiculo(int r)
	{
		this.ruedas=r;
		tipo=0;
		pvp=0;
		cv=0;
		bastidor="Sin bastidor";
	}
	
//Constructor con variables	
	Vehiculo(char p1)
	{
		switch(p1)
		{
		case 'A':
			tipo=1;
			ruedas=2;
			break;
		case 'B':
			tipo=2;
			ruedas=4;
			break;
		case 'C':
			tipo=3;
			ruedas=8;
			break;
		default:
			ruedas=4;
			tipo=0;
		}
		pvp=0;
		cv=0;
		bastidor="Sin bastidor";
	}
	
//Constructor que inicialize PVP y Bastidor
	Vehiculo (double pr1, String bs1)
	{
		this.pvp=pr1;
		this.bastidor=bs1;
		ruedas=4;
		tipo=1;
		cv=4;
	}
	
	
//verDatos()
//print de todas las variables
	public void verDatos()
	{
		System.out.println("Ruedas: "+ruedas);
		System.out.println("Tipo: "+tipo);
		System.out.println("Bastidor: "+bastidor);
		System.out.println("CV: "+cv);
		System.out.println("PVP: "+pvp);
	}
	
//Getters and Setters	

public int getTipo() {
	return tipo;
}
public void setTipo(int tipo) {
	if (tipo==1 || tipo==2 ||tipo==3)
	{this.tipo = tipo;}
	else {System.out.println("Los datos son del 1 al 3");}
}
public int getRuedas() {
	return ruedas;
}
public void setRuedas(int ruedas) {
	this.ruedas = ruedas;
}
public String getBastidor() {
	return bastidor;
}
public void setBastidor(String bastidor) {
	this.bastidor = bastidor;
}
public int getCv() {
	return cv;
}
public void setCv(int cv) {
	this.cv = cv;
}
public double getPvp() {
	return pvp;
}
public void setPvp(double pvp) {
	this.pvp = pvp;
}

public int getPotencia()
{
	return cv*2;
}		

public double Precio()
{
	double impuestos=0;
	if(tipo==0) return pvp;
	if(tipo==1) impuestos=10;
	if(tipo==2) impuestos=12;
	if(tipo==1) impuestos=15;
		
	return pvp+(pvp*(impuestos/100));
}





}
