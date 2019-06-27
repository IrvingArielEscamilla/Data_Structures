package mx.algoritmia.CapituloDos;
import java.util.*;

public class IngresaDatos {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nom = scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = scanner.nextInt();
		
		System.out.println("Ingrese su altura: ");
		double altura = scanner.nextDouble();
		
		String x = "";
		x+= "Yo soy " + nom + " tengo " + edad + " anios ";
		x+= " y mido " + altura + " metros ";
		
		System.out.println(x);
		
	}
}
