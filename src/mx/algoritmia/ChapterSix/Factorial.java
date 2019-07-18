package mx.algoritmia.CapituloSeis;

public class Factorial {
	
	long x;
	
	public Factorial(int x) {
		// TODO Auto-generated constructor stub
		this.x =x;
	}

	public long  numFactorial(int x) {
		
		long fact ;
		
		if(x==0) {
			
			fact = 1;
			
		}else {
			
			fact =  x*numFactorial(x-1);
			
		}
		return fact;
		
	}

	public String toString() {
		return "Factorial de " + x + " es:" + numFactorial((int) x);
		
	}
	
}
