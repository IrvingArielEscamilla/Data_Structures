package mx.algoritmia.CapituloSeis;

public class FibRecursivo {
	
	public static long cont;
	
	public static void main (String[] args) {
		
		Performance p =  new Performance();
		
		int desde = 40 ;
		int hasta = 50 ;
		
		double ant = -1;
		
		for(int i=desde; i<=hasta; i ++) {
			
			cont = -1;
			p.start();
			
			double f = fibonacci(i);
			
			p.stop();
			System.out.println("f (" +i+") = "+f+", "+p.getMillis()+ " ms, " +cont+ "veces.");
			
			if(ant >=0) {
				System.out.println("Incr = "+ f/ant);
			}else {
				System.out.println();
			}
			ant =f;
		}
	}
	
	private static double fibonacci(int x) {
		cont ++ ;
		return x<=2 ? 1:fibonacci(x-1) + fibonacci(x-2);
	}
}
