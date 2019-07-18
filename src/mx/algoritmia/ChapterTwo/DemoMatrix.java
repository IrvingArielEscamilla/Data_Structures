package ChapterTwo;
import java.util.Scanner;

public class DemoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of rows: " + "\n");
		int rows = scanner.nextInt();
		
		System.out.print("Number of columns" + "\n");
		int columns = scanner.nextInt();
		
		int mat [] [] = new int[rows][columns];
		
		for(int i=0; i<rows ;i++) {
			for(int j=0; j<columns; j++) {
				int number = (int)(Math.random()*1000);
				mat[i][j] = number;
				
			}
		}
		
		for (int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(mat[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}

}
