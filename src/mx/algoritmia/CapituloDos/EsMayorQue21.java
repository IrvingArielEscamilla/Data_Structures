package mx.algoritmia.CapituloDos;
import java.util.*;

public class EsMayorQue21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad =  scanner.nextInt();
		
		if (edad >= 21) {
			System.out.println("Ud. es mayor de edad ");
		}else {
			
			System.out.println("Ud. es menor de edad");
		}
		
	}

}
