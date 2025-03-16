package Model;

public class Radicacion extends Operacion {

	  public Radicacion(double numero1, double numero2) {
	        super(numero1, numero2);
	    }
	    
	    @Override
	    public double calcular() {
	        return Math.pow(numero1, 1 / numero2);
	    }

}
