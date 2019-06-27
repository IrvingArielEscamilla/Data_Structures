package mx.algoritmia.CapituloDos;
import java.util.*;

public class Cadenas8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese una cadena: ");
		String s1 = scanner.next();
		
		System.out.println("Ingrese otra cadena: ");
		String s2 = scanner.next();
		
		System.out.println("s1 = [" + s1 +"]");
		System.out.println("s2 = [" + s2 +"]");
		//esto no debe hacerse
		
		if(s1==s2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintas");
		}
		//forma correcta
		
		if(s1.equals(s2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}

}
