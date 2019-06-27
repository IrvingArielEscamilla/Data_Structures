package mx.algoritmia.CapituloSeis;
import java.util.Scanner;

public class MuestraNaturalesInverso {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
	muestraNaturales(x);
	}
	private  static void  muestraNaturales(int x) {
		
		System.out.println(x);
				if(x>0) {

			
			 muestraNaturales(x-1);
		}
		
	}
}
