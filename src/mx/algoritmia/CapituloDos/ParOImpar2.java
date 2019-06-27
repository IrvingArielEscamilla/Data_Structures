//par o impar usando if-inline

package mx.algoritmia.CapituloDos;
import java.util.*;

public class ParOImpar2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		int resto =v%2;
		String mssg = (resto == 0)? "Es par": "Es impar";
		System.out.println(v + " " + mssg);
		
	}

}
