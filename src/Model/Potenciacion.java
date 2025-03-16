package Model;

public class Potenciacion extends Operacion {

	 public Potenciacion(double numero1, double numero2) {
	        super(numero1, numero2);
	    }
	    
	    @Override
	    public double calcular() {
	        return Math.pow(numero1, numero2);
	    }
}
