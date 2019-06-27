package mx.algoritmia.CapituloDos;
import java.util.*;

public class PrimeroNumeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un numero:"  );
		int n = scanner.nextInt();
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= n);

	}

}
