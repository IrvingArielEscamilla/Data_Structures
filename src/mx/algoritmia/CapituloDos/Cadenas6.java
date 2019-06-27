package mx.algoritmia.CapituloDos;
import java.util.*;

public class Cadenas6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero: ");
		int v = scanner.nextInt();
		
		System.out.println("Valor ingresado: " + v);
		System.out.println("binario = "+ Integer.toBinaryString(v));
		System.out.println("octal = " + Integer.toOctalString(v));
		System.out.println("hexadecimal = " + Integer.toHexString(v));
		
		System.out.println("Ingrese una base numerica: ");
		int b = scanner.nextInt();
		
		String sBaseN = Integer.toString(v,b);
		System.out.println(v + " en base (" +b +") = " +sBaseN);
		
	}

}
