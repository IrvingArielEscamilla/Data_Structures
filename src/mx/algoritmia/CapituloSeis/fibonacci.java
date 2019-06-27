package mx.algoritmia.CapituloSeis;
import java.util.Scanner;

public class fibonacci {
	
	public  static double fibonacci(int n) {
		double f;
		if(n<=2) {
			f=1;
		}else {
			f = fibonacci(n-1) + fibonacci(n-2);
		}
		
		return f;
	}

	public static double fibonacciIter(int n) {
		
		double f=1,r1=1,r2=1;
		for(int i=3; i<=n ; i++) {
			f = r1+r2;
			r1 = r2;
			r2 = f;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese valor: ");
		int n =scanner.nextInt();
		
		double f = fibonacci(n);
		System.out.println("El termino " + n + " es: " + f);
		scanner.close();
	}
}
