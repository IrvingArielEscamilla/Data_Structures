package mx.algoritmia.CapituloDos;
import java.util.*;

public class DemoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cantidad de filas");
		int n = scanner.nextInt();
		
		System.out.println("Ingrese cantidad de columnas");
		int m = scanner.nextInt();
		
		int mat [][] = new int [n][m];
		
		for( int i=0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
