package Model;


// Subclases que implementan cada operación
class Suma extends Operacion {
	
	    public Suma(double numero1, double numero2) {
	        super(numero1, numero2);
	    }
	    
	    @Override
	    public double calcular() {
	        return numero1 + numero2;
	    }
	}

