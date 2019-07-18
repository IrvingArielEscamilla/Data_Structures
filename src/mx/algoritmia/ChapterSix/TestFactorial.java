package mx.algoritmia.CapituloSeis;
import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int x =  scanner.nextInt();
		Factorial fact =  new Factorial(x);
		
		System.out.println(fact);
	}

	
	
}
