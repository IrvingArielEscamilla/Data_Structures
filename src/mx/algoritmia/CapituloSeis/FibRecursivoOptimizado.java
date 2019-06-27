package mx.algoritmia.CapituloSeis;
import java.util.Hashtable;
import java.util.Scanner;

public class FibRecursivoOptimizado {
	
	
	
	public static void main(String[] args) {
		
		Hashtable<Integer, Double> t = new Hashtable<Integer,Double>();
		t.put(1, 1d);
		t.put(2, 1d);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos terminos quiere ver: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			double f = fibonacci(i,t);
			System.out.println("fib(" + i + ") =" + f);
		}
	}
	
	
	private static double fibonacci(int x, Hashtable<Integer,Double>t) {
		
		Double d = t.get(x);
		
		if(d==null) {
			d= fibonacci(x-1,t) + fibonacci(x-2, t);
			t.put(x, d);
			}
		return d;
	}
}
