package Model;

public class Division extends Operacion {

	  public Division(double numero1, double numero2) {
	        super(numero1, numero2);
	    }
	    
	    @Override
	    public double calcular() {
	        if (numero2 == 0) {
	            throw new ArithmeticException("División por cero no permitida");
	        }
	        return numero1 / numero2;
	    }

}
