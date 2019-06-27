package mx.algoritmia.CapituloSeis;
import java.util.Scanner;

public class MuestraNaturales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		muestraNaturales(n);
	}
	
	private static void muestraNaturales(int n) {
		
		if(n>0) {
			
			muestraNaturales(n-1);
			
		}
		
		System.out.println(n);	
		
	}

}
