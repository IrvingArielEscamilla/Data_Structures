package mx.algoritmia.CapituloDos;
import java.util.*;

public class ParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner (System.in);
		System.out.println("Ingrese un numero:");
		int v = scanner.nextInt();
		
		int resto = v%2;
		
		if(resto == 0) {
			System.out.println( v + " Es par");
		}else {
			System.out.println(v + " Es impar");
		}
	}

}
