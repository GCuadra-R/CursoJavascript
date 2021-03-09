package herencia;

public class Principal {
    public static void main(String[] args){
    }
	
	/*
	Padre p1=new Padre(1,"hola");
          
    System.out.println(p1.getDato());
    System.out.println(p1.getCod());
    
    Hijo1 h1=new Hijo1(100, "Pedro");
    h1.setPaga_semanal(200);
    
    System.out.println(h1.getDato());
    System.out.println(h1.getCod());
    System.out.println(h1.getPaga_semanal());
    System.out.println(h1.paga_mensual());

    	Expediente ex1=new 
    	ex1.setCodexpediente(100000);
    	ex1.setDescripcion("Desripcionvckls ajnmkfjdkflasl");
    	ex1.setResponsable("Pedro");
    	ex1.setTipo("Z");
    	ex1.verdatos();		
    		
    	
    	Multa m1=new Multa();
    	m1.setCodexpediente(90000);
    	m1.setDescripcion("fmlsfklafkldsjaklfjflka");
    	m1.setTipo("X");
    	m1.setResponsable("pepito");
    	m1.setImporte(1000);
    	
    	m1.verdatos();
    	m1.getImporte();
    
   
    	Multa_Trafico mt1=new Multa_Trafico(1000, "B");
    	mt1.setDescripcion("Saltar un ceda el paso");
    	mt1.setResponsable("conductor");
    	mt1.setMatricula("M111111");
    	mt1.verdatos();
  
    	String saberTipo(Expediente c1) {
    		if (c1 instanceof Expediente) {
    			return "Eres Expediente";
    		}
    		if (c1 instanceof Multa) {
    			return "Eres Multa";
    		}
    		if (c1 instanceof Multa_Trafico) {
    			return "Eres Trafico";
    		}
    		if (c1 instanceof MultaCovid) {
    			return "Eres covid";
    		}

    		return "No se";
    	}
    */
    	public static String multaMayorImporte(Multa m1, Multa m2) {
        	String cadena;
        	if(m1.getImporte() > m2.getImporte()) {
        		cadena = "El importe mayor es el de la multa: " + m1.getCodexpediente();
        	 
        	} else if(m1.getImporte() < m2.getImporte()) {
        		cadena = "El importe mayor es el de la multa: " + m2.getCodexpediente();
        	} else {
        		cadena = "Ambas multas tienen el mismo importe";
        	}
        	return cadena;
        }

    	public String conocerTipo(Object x) {
    		return "Eres de tipo --> "+x;
    	}
    }
